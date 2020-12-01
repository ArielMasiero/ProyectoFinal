package dao.interfaces;

import java.util.List;

import dao.negocio.Aeropuerto;;

public interface AeropuertoInterface {
	public boolean addAeropuerto(Aeropuerto aeropuerto);
	public Aeropuerto viewAeropuerto(Aeropuerto aeropuerto);
	public List<Aeropuerto> getAllAeropuerto();
}
