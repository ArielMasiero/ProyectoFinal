package dao.implementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.interfaces.AeropuertoInterface;
import dao.interfaces.VentasInterfaces;
import dao.interfaces.VuelosInterfaces;
import dao.negocio.Aeropuerto;
import dao.negocio.Cliente;
import dao.negocio.Ventas;
import dao.negocio.Vuelos;
import dao.utils.Coneccion;

public class VuelosImplementacion implements VuelosInterfaces{
	private String query;
	private Coneccion con;
	Statement stm;
	PreparedStatement prep;
	@Override
	public boolean addVuelo(Vuelos vuelo) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				con.getConeccion().setAutoCommit(false);
				query = "INSERT INTO [dbo].[Vuelo]( [nombreAerolinea], [cantAsientos], [asientosDisponibles], [AeropuertoSalida], [AeropuertoLlegada], [fechaHoraSalida], [fechaHoraLlegada], [tiempoVuelo]) \r\n" + 
						"    VALUES(?,?, ?, ?, ?, ?, ?, ?);";
				prep = con.getConeccion().prepareStatement(query);
				prep.setString(1,vuelo.getNombreAerolinea());
				prep.setInt(2, vuelo.getCantAsientos());
				prep.setInt(3, vuelo.getAsientosDisponibles());
				prep.setInt(4, Integer.parseInt(vuelo.getAeropuertoSalida().getId()));
				prep.setInt(5, Integer.parseInt(vuelo.getAeropuertoLlegada().getId()));
				prep.setDate(6, convertUtilToSql(vuelo.getFechaHoraSalida()));
				prep.setDate(7, convertUtilToSql(vuelo.getFechaHoraLlegada()));
				prep.setString(8,vuelo.getTiempoVuelo());
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
	public boolean deleteVuelo(Vuelos vuelo) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				query = ("DELETE FROM Vuelo  where id_Vuelo=?;");
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1,vuelo.getId_vuelo());
				int r = prep.executeUpdate();
				if(r==1) {
					prep.close();
					con.cerrarConeccion();
					return true;
				}
			}
			prep.close();
			con.cerrarConeccion();
		}catch(SQLException e) {
			
		}
		return false;
	}

	@Override
	public boolean updateVuelo(Vuelos vuelo) {
		try {
		con = new Coneccion();
		if(con.iniciarConeccion()) {
			query = ("UPDATE Vuelo \r\n" + 
					"    SET  nombreAerolinea=?, cantAsientos=?, asientosDisponibles=?, AeropuertoSalida=?, AeropuertoLlegada=?, fechaHoraSalida=?, fechaHoraLlegada=?, tiempoVuelo=?\r\n" + 
					"    WHERE id_Vuelo = ?;");
			prep = con.getConeccion().prepareStatement(query);
			prep.setString(1,vuelo.getNombreAerolinea());
			prep.setInt(2, vuelo.getCantAsientos());
			prep.setInt(3, vuelo.getAsientosDisponibles());
			prep.setInt(4, Integer.parseInt(vuelo.getAeropuertoSalida().getId()));
			prep.setInt(5, Integer.parseInt(vuelo.getAeropuertoLlegada().getId()));
			prep.setDate(6, convertUtilToSql(vuelo.getFechaHoraSalida()));
			prep.setDate(7, convertUtilToSql(vuelo.getFechaHoraLlegada()));
			prep.setString(8,vuelo.getTiempoVuelo());
			prep.setInt(9,vuelo.getId_vuelo());
			int r = prep.executeUpdate();
			if(r==1) {
				prep.close();
				con.cerrarConeccion();
				return true;
			}
		}
		prep.close();
		con.cerrarConeccion();
	}catch(SQLException e) {
		
	}
	return false;
	}

	@Override
	public Vuelos viewVuelo(Vuelos vuelo) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				query = "SELECT * FROM Cliente WHERE id_Vuelo=?";
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1, vuelo.getId_vuelo());
				ResultSet rs = prep.executeQuery();
				rs.next();
				Vuelos nuevo = new Vuelos(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),getAeropuerto(rs.getInt(5)),getAeropuerto(rs.getInt(6)),convertFromSQLDateToJAVADate(rs.getDate(7)),convertFromSQLDateToJAVADate(rs.getDate(8)),rs.getString(9),null);
				prep.close();
				con.cerrarConeccion();
				return nuevo;
			}
			prep.close();
			con.cerrarConeccion();
		}catch(SQLException e) {
			
		}
		return null;
	}
	
	private Aeropuerto getAeropuerto (int id) {
		Aeropuerto aeropuerto = new Aeropuerto();
		aeropuerto.setId(String.valueOf(id));
		AeropuertoImplementacion ae = new AeropuertoImplementacion();
		aeropuerto = ae.viewAeropuerto(aeropuerto);
		return aeropuerto;
	}
	@Override
	public List<Vuelos> getAllVuelos() {
		List <Vuelos> lista = new ArrayList<Vuelos>();
		con = new Coneccion();
		try{
		if(con.iniciarConeccion()) {
			query = "SELECT * FROM Vuelo";
			prep = con.getConeccion().prepareStatement(query);
			ResultSet rs = prep.executeQuery();
			while(rs.next()) {
				lista.add(new Vuelos(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),getAeropuerto(rs.getInt(5)),getAeropuerto(rs.getInt(6)),convertFromSQLDateToJAVADate(rs.getDate(7)),convertFromSQLDateToJAVADate(rs.getDate(8)),rs.getString(9),null));
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
