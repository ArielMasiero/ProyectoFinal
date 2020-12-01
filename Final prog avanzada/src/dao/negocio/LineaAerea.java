package dao.negocio;

import java.io.Serializable;
import java.util.ArrayList;

public class LineaAerea implements Serializable {
	private static final long serialVersionUID = 664L;
	private int id;
	private String nombre;
	private int alianza;
	private ArrayList<String> vuelos;
	
	public LineaAerea(){
		ArrayList<String> vuelos = new ArrayList<String>();
	}
	
	
	public LineaAerea(int id ,String nombre, int alianza, ArrayList<String> vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.alianza = alianza;
		this.vuelos = vuelos;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAlianza() {
		return alianza;
	}
	public void setAlianza(int alianza) {
		this.alianza = alianza;
	}
	public ArrayList<String> getVuelos() {
		return vuelos;
	}
	public void setVuelos(ArrayList<String> vuelos) {
		this.vuelos = vuelos;
	}


	@Override
	public String toString() {
		return nombre;
	}
	
}
