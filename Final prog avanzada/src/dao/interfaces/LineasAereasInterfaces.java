package dao.interfaces;

import java.util.List;

import dao.negocio.LineaAerea;

public interface LineasAereasInterfaces {
	public boolean addLineaAerea(LineaAerea linea);
	public boolean deleteLineaAerea(LineaAerea linea);
	public boolean updateLineaAerea(LineaAerea linea);
	public LineaAerea viewLineaAerea(LineaAerea linea);
	public List<LineaAerea> getAllLineaAerea();
}
