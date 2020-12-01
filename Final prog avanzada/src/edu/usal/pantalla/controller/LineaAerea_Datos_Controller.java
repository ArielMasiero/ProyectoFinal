package edu.usal.pantalla.controller;

import java.sql.SQLException;

import edu.usal.negocio.dao.implementacion.SQL.LineaAereaDAOImplSQL;
import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dao.interfaces.LineaAereaDAO;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineaAerea;
import edu.usal.pantalla.vista.Cliente_Datos_Vista;
import edu.usal.pantalla.vista.LineaAerea_Datos_Vista;
import edu.usal.util.IOGeneral;

public class LineaAerea_Datos_Controller {
	
	LineaAerea_Datos_Vista menu;
	MenuPrincipalController mPController;
	private LineaAereaDAO aerolineadao;
	

	public LineaAerea_Datos_Controller(MenuPrincipalController menuPrincipalController) {
		this.mPController= menuPrincipalController;
		menu = new LineaAerea_Datos_Vista(this);
	}
	
	public LineaAerea_Datos_Controller(MenuPrincipalController menuPrincipalController, LineaAerea aerolinea) {
		this.mPController= menuPrincipalController;
		menu = new LineaAerea_Datos_Vista(this , aerolinea);
		
	}

	public void guardarDatos(LineaAerea_Datos_Vista vista) {
		try {
			aerolineadao = new LineaAereaDAOImplSQL();	
			if(vista.getLblID_Asignado().getText().equalsIgnoreCase("Asignacion automatica")) {
				if(aerolineadao.addLineaAerea(new LineaAerea(0, vista.getTextNombre().getText(), vista.getComboBoxAlianza().getSelectedIndex(),	 null))) {
					vista.exitoOperacion();
				}else {
					vista.fracasoOperacion();
				}
			}else {
				if(aerolineadao.updateLineaAerea(new LineaAerea(Integer.parseInt(vista.getLblID_Asignado().getText()), vista.getTextNombre().getText(), vista.getComboBoxAlianza().getSelectedIndex(), null))) {
					vista.exitoOperacion();
				}else {
					vista.fracasoOperacion();
				}
			}
		} catch (SQLException e) {
			IOGeneral.pritln(">>>>>Error con la base de datos<<<<<");
			IOGeneral.pritln(e.getMessage());
		}
		vista.dispose();
		mPController.hacerVisibleMP();
	}
	public void eliminarDatos(LineaAerea_Datos_Vista vista) {
		try {
			aerolineadao = new LineaAereaDAOImplSQL();	
			if(aerolineadao.deleteLineaAerea(new LineaAerea(0, vista.getTextNombre().getText(), vista.getComboBoxAlianza().getSelectedIndex(),	 null))) {
				vista.exitoOperacion();
			}else {
				vista.fracasoOperacion();
			}
		} catch (SQLException e) {
			IOGeneral.pritln(">>>>>Error con la base de datos<<<<<");
			IOGeneral.pritln(e.getMessage());
		}
		vista.dispose();
		mPController.hacerVisibleMP();
	}
	
}
