package dao.negocio;

import java.io.Serializable;
import java.util.Date;

import dao.negocio.Pais;

public class Pasaporte implements Serializable{
	private static final long serialVersionUID = 754L;
	private String nroPasaporte;
	private Pais pais;
	private String autoridademision;
	private Date emision;
	private Date vencimiento;
	
	public Pasaporte(){
	}
		
	public Pasaporte(String nroPasaporte, Pais pais, String autoridademision, Date emision, Date vencimiento) {
		super();
		this.nroPasaporte = nroPasaporte;
		this.pais = pais;
		this.autoridademision = autoridademision;
		this.emision = emision;
		this.vencimiento = vencimiento;
	}

	public String getNroPasaporte() {
		return nroPasaporte;
	}
	public void setNroPasaporte(String nroPasaporte) {
		this.nroPasaporte = nroPasaporte;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getAutoridademision() {
		return autoridademision;
	}
	public void setAutoridademision(String autoridademision) {
		this.autoridademision = autoridademision;
	}
	public Date getEmision() {
		return emision;
	}
	public void setEmision(Date emision) {
		this.emision = emision;
	}
	public Date getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}
}
