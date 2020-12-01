package dao.implementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.interfaces.LineasAereasInterfaces;
import dao.negocio.LineaAerea;
import dao.utils.Coneccion;

public class LineaAereaImplementacion implements LineasAereasInterfaces{
	Coneccion con;
	Statement stm;
	PreparedStatement prep;
	String query; 
	
	@Override
	public boolean addLineaAerea(LineaAerea linea) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				query = "INSERT INTO Aerolinea VALUES (?,?)";
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1, linea.getAlianza());
				prep.setString(2, linea.getNombre());
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
	public boolean deleteLineaAerea(LineaAerea linea) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				query = "DELETE FROM Aerolinea WHERE ID_Aerolinea= ? ;";
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1, linea.getId());
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
	public boolean updateLineaAerea(LineaAerea linea) {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				query = "UPDATE Aerolinea SET ID_Alianza= ? ,Nombre= ? WHERE ID_Aerolinea= ? ;";
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1, linea.getAlianza());
				prep.setString(2, linea.getNombre());
				prep.setInt(3, linea.getId());
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
	public LineaAerea viewLineaAerea(LineaAerea linea) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LineaAerea> getAllLineaAerea() {
		try {
			con = new Coneccion();
			if(con.iniciarConeccion()) {
				query = "SELECT count(*)  FROM Aerolinea;";
				stm = con.getConeccion().createStatement();
				ResultSet rs = stm.executeQuery(query);
				rs.next();
				ArrayList<LineaAerea> array = new ArrayList<LineaAerea>();
				query = "SELECT *  FROM Aerolinea;";
				stm = con.getConeccion().createStatement();
				rs = stm.executeQuery(query);
				
				while(rs.next()) {
					array.add(new LineaAerea(rs.getInt(1),rs.getString(3), rs.getInt(2), null));
					
				}
				rs.close();
				con.cerrarConeccion();
			
				return array;
				
			}
		}catch(SQLException e) {
			
		}
		return null;
	}

}
