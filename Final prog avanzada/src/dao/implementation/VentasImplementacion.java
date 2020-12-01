package dao.implementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.interfaces.VentasInterfaces;
import dao.negocio.Cliente;
import dao.negocio.LineaAerea;
import dao.negocio.Ventas;
import dao.negocio.Vuelos;
import dao.utils.Coneccion;

public class VentasImplementacion implements VentasInterfaces{
	private String query;
	private Coneccion con;
	Statement stm;
	PreparedStatement prep;
	@Override
	public boolean addVenta(Ventas venta) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				con.getConeccion().setAutoCommit(false);
				query = ("INSERT INTO [dbo].[venta]( [id_Cliente], [id_Vuelo], [id_Aereolinea], [fechaHoraVenta], [formaPago], [totalPagar], [cant_vuelos]) \r\n" + 
						"    VALUES(?, ?, ?, ?, ?, ?, ?)\r\n);");
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1,Integer.parseInt(venta.getCliente()));
				prep.setInt(2, venta.getVuelo().getId_vuelo());
				prep.setInt(3, Integer.parseInt(venta.getLineaAerea()));
				prep.setDate(4, convertUtilToSql(venta.getFechaHoraVenta()));
				prep.setString(5, venta.getFormaPago());
				prep.setString(6, venta.getTotalPagar());
				prep.setInt(6, venta.getCant_vuelos());
				int r = prep.executeUpdate();
				if(r==1) {
					prep.close();
					con.getConeccion().commit();
					con.cerrarConeccion();
					return true;
				}
			}
			con.getConeccion().rollback();
			prep.close();
			con.cerrarConeccion();
		}catch(SQLException e){
			}
		return false;
	}

	@Override
	public Ventas viewVenta(Ventas venta) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				con.getConeccion().setAutoCommit(false);
				query = "SELECT * FROM venta WHERE id_Ventas = ?";
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1,venta.getId_venta());
				ResultSet rs = prep.executeQuery();
				rs.next();
				Ventas nuevo= new Ventas(rs.getInt(1),rs.getString(2),getVuelo(rs.getInt(3)),rs.getString(4),convertFromSQLDateToJAVADate(rs.getDate(5)),rs.getString(6),rs.getString(7),rs.getInt(8));
				prep.close();
				con.cerrarConeccion();;
				return nuevo;
				
			}
			prep.close();
			con.cerrarConeccion();
		}catch(SQLException e) {
			
		}
		return null;
	}
	
	
	private Vuelos getVuelo(int idVuelo) {
		Vuelos vuelo= new Vuelos();
		vuelo.setId_vuelo(idVuelo);
		VuelosImplementacion vue = new VuelosImplementacion();
		vuelo = vue.viewVuelo(vuelo);
		return vuelo;
	}
	
	
	
	@Override
	public List<Ventas> getAllVentas() {
		List <Ventas> lista = new ArrayList<Ventas>();
		con = new Coneccion();
		try{
		if(con.iniciarConeccion()) {
			query = "SELECT * FROM venta";
			prep = con.getConeccion().prepareStatement(query);
			ResultSet rs = prep.executeQuery();
			while(rs.next()) {
				lista.add(new Ventas(rs.getInt(1),rs.getString(2),getVuelo(rs.getInt(3)),rs.getString(4),convertFromSQLDateToJAVADate(rs.getDate(5)),rs.getString(6),rs.getString(7),rs.getInt(8)));
				}
			prep.close();
			con.cerrarConeccion();
			return lista;
		}
		prep.close();
		con.cerrarConeccion();
		}catch(SQLException e) {
			
		}
		return null;
		}
	
	@SuppressWarnings("deprecation")
	private String fechaToString(Date fecha) {
		return fecha.getYear()+"-"+fecha.getMonth()+"-"+fecha.getDay();
	}
	private Date stringToFecha(String fecha) {
		String[] valores = fecha.split("-");
		@SuppressWarnings("deprecation")
		Date nuevo = new Date(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]), Integer.parseInt(valores[2]));
		return nuevo;
	}
	private java.sql.Date convertUtilToSql(java.util.Date uDate) {
			        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
			        return sDate;
			    }
	private java.util.Date convertFromSQLDateToJAVADate(java.sql.Date sqlDate) {
        java.util.Date javaDate = null;
        if (sqlDate != null) {
            javaDate = new Date(sqlDate.getTime());
        }
        return javaDate;
    }
}
