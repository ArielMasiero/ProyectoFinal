package dao.negocio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import dao.negocio.Aeropuerto;

public class Vuelos {
	private static final long serialVersionUID = 196L;
	private int id_vuelo;
	private String nombreAerolinea;
	private Integer cantAsientos;
	private Integer asientosDisponibles;
	private Aeropuerto aeroSalida;
	private Aeropuerto aeroLlegada;
	private Date fechaHoraSalida;
	private Date fechaHoraLlegada;
	private String tiempoVuelo;
	
	public Vuelos(){
		Calendar fechaHoraSalida = new GregorianCalendar();
		Calendar fechaHoraLlegada= new GregorianCalendar();
		List<String> clientes = new ArrayList<String>();
	}
	
	
	public Vuelos(int id_vuelo, String nombreAerolinea, Integer cantAsientos, Integer asientosDisponibles,
			 Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada, Date fechaHoraSalida, Date fechaHoraLlegada,
			String tiempoVuelo, List<String> clientes) {
		super();
		this.id_vuelo = id_vuelo;
		this.nombreAerolinea = nombreAerolinea;
		this.cantAsientos = cantAsientos;
		this.asientosDisponibles = asientosDisponibles;
		this.aeroSalida = aeropuertoSalida;
		this.aeroLlegada = aeropuertoLlegada;
		this.fechaHoraSalida = fechaHoraSalida;
		this.fechaHoraLlegada = fechaHoraLlegada;
		this.tiempoVuelo = tiempoVuelo;
	}

	public int getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
	}
	public String getNombreAerolinea() {
		return nombreAerolinea;
	}
	public void setNombreAerolinea(String nombreAerolinea) {
		this.nombreAerolinea = nombreAerolinea;
	}
	public Integer getCantAsientos() {
		return cantAsientos;
	}
	public void setCantAsientos(Integer cantAsientos) {
		this.cantAsientos = cantAsientos;
	}
	public Aeropuerto getAeropuertoSalida() {
		return aeroSalida;
	}
	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
		this.aeroSalida = aeropuertoSalida;
	}
	public Aeropuerto getAeropuertoLlegada() {
		return aeroLlegada;
	}
	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeroLlegada = aeropuertoLlegada;
	}
	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Date getFechaHoraLlegada() {
		return fechaHoraLlegada;
	}
	public void setFechaHoraLlegada(Date fechaHoraLlegada) {
		this.fechaHoraLlegada = fechaHoraLlegada;
	}
	public String getTiempoVuelo() {
		return tiempoVuelo;
	}
	public void setTiempoVuelo(String tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}
	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}
	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}
	
}
