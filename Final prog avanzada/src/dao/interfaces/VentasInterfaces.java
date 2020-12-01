package dao.interfaces;

import java.util.List;

import dao.negocio.Ventas;

public interface VentasInterfaces {
	public boolean addVenta(Ventas venta);
	public Ventas viewVenta(Ventas venta);
	public List<Ventas> getAllVentas();
}
