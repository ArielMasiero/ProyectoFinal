package dao.negocio;

import java.io.Serializable;

public class Telefono implements Serializable{
	private static final long serialVersionUID = 640L;
	private String nroPersonal;
	private String nroCelular;
	private String nroLaboral;
	
	public Telefono() {
		
	}
	
	public Telefono(String nroPersonal, String nroCelular, String nroLaboral) {
		super();
		this.nroPersonal = nroPersonal;
		this.nroCelular = nroCelular;
		this.nroLaboral = nroLaboral;
	}
	public String getNroPersonal() {
		return nroPersonal;
	}
	public void setNroPersonal(String nroPersonal) {
		this.nroPersonal = nroPersonal;
	}
	public String getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(String nroCelular) {
		this.nroCelular = nroCelular;
	}
	public String getNroLaboral() {
		return nroLaboral;
	}
	public void setNroLaboral(String nroLaboral) {
		this.nroLaboral = nroLaboral;
	}
	
	
	
}
