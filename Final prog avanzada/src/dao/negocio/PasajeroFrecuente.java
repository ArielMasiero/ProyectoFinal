package dao.negocio;

public class PasajeroFrecuente {
	/**
	 * 
	 */
	private static final long serialVersionUID = 233L;
	private int alianza;
	private int aerolinea;
	private String numero;
	private String Catergoria;
	
	public PasajeroFrecuente() {
		
	}
	
	public PasajeroFrecuente(int alianza, int aerolinea, String numero, String catergoria) {
		super();
		this.alianza = alianza;
		this.aerolinea = aerolinea;
		this.numero = numero;
		Catergoria = catergoria;
	}
	public int getAlianza() {
		return alianza;
	}
	public void setAlianza(int alianza) {
		this.alianza = alianza;
	}
	public int getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(int aerolinea) {
		this.aerolinea = aerolinea;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCatergoria() {
		return Catergoria;
	}
	public void setCatergoria(String catergoria) {
		Catergoria = catergoria;
	}
	
	
}
