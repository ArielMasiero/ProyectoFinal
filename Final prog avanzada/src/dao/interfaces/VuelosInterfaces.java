package dao.interfaces;

import java.util.List;

import dao.negocio.Vuelos;

public interface VuelosInterfaces {
	public boolean addVuelo(Vuelos vuelo);
	public boolean deleteVuelo(Vuelos vuelo);
	public boolean updateVuelo(Vuelos vuelo);
	public Vuelos viewVuelo(Vuelos vuelo);
	public List<Vuelos> getAllVuelos();
}
