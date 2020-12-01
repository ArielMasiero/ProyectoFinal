package dao.negocio;

public class Aeropuerto {
	private String id;
	private String cuidad;
	private String provincia;
	private String pais;
	
	public Aeropuerto() {
		super();
	}

	public Aeropuerto(String id, String cuidad, String provincia, String pais) {
		super();
		this.id = id;
		this.cuidad = cuidad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Auropuesto [id=" + id + ", cuidad=" + cuidad + ", provincia=" + provincia + ", pais=" + pais + "]";
	}
	
}
