package dao.implementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.interfaces.AeropuertoInterface;
import dao.negocio.Aeropuerto;
import dao.negocio.Vuelos;
import dao.utils.Coneccion;

public class AeropuertoImplementacion implements AeropuertoInterface{
	private String query;
	private Coneccion con;
	Statement stm;
	PreparedStatement prep;
	@Override
	public boolean addAeropuerto(Aeropuerto aeropuerto) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				con.getConeccion().setAutoCommit(false);
				query = "INSERT INTO [dbo].[aeropuerto]([ciudad], [provincia], [pais]) \r\n" + 
						"    VALUES(?, ?, ?, ?);";
				prep = con.getConeccion().prepareStatement(query);
				prep.setString(1,aeropuerto.getCuidad());
				prep.setString(2, aeropuerto.getProvincia());
				prep.setString(3, aeropuerto.getPais());
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
	public Aeropuerto viewAeropuerto(Aeropuerto aeropuerto) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				query = "SELECT * FROM aeropuerto WHERE id_Aeropuerto=?";
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1, Integer.parseInt(aeropuerto.getId()));
				ResultSet rs = prep.executeQuery();
				rs.next();
				Aeropuerto nuevo = new Aeropuerto(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
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

	@Override
	public List<Aeropuerto> getAllAeropuerto() {
		List <Aeropuerto> lista = new ArrayList<Aeropuerto>();
		con = new Coneccion();
		try{
		if(con.iniciarConeccion()) {
			query = "SELECT * FROM Vuelo";
			prep = con.getConeccion().prepareStatement(query);
			ResultSet rs = prep.executeQuery();
			while(rs.next()) {
				lista.add(new Aeropuerto(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
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

}
