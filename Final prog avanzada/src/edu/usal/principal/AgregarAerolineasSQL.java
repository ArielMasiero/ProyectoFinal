package edu.usal.principal;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.usal.negocio.dao.implementacion.Stream.LineaAereaDAOImplFileStream;
import edu.usal.negocio.dao.interfaces.LineaAereaDAO;
import edu.usal.negocio.dominio.LineaAerea;
import edu.usal.util.Coneccion;
import edu.usal.util.IOGeneral;
import edu.usal.util.PropertiesUtil;

public class AgregarAerolineasSQL {
	public static void main(String[] args) {
		try{

			LineaAereaDAO lineaAerea = new LineaAereaDAOImplFileStream();
			List<LineaAerea> lista = leer();
			Coneccion con = new Coneccion();
			con.iniciarConeccion();
			PreparedStatement prep;
			for (LineaAerea linea : lista) {
				String query = ("INSERT INTO Aerolinea VALUES (?,?)");
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1, linea.getAlianza());
				prep.setString(2, linea.getNombre());
				IOGeneral.pritln(String.valueOf(prep.executeUpdate())+linea.getNombre());
				prep.close();				
			}
			con.cerrarConeccion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static ArrayList<LineaAerea> leer(){
		ArrayList<LineaAerea> lista = new ArrayList<LineaAerea>();
		try {
			
			File file= new File(PropertiesUtil.getPathTxt(), PropertiesUtil.getNameAllAeroLineas());
			Scanner scanner= new Scanner(file);
			while (scanner.hasNextLine()){
				String[] straux = scanner.nextLine().split("-");
				LineaAerea nueva = new LineaAerea();
				nueva.setAlianza(Integer.parseInt(straux[0]));
				nueva.setNombre(straux[1]);
				nueva.setVuelos(new ArrayList<String>());
				lista.add(nueva);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
}
