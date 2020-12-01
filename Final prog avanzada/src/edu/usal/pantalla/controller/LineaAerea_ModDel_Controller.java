package edu.usal.pantalla.controller;

import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import edu.usal.negocio.dao.implementacion.SQL.ClienteDAOImplSQL;
import edu.usal.negocio.dao.implementacion.SQL.LineaAereaDAOImplSQL;
import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dao.interfaces.LineaAereaDAO;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineaAerea;
import edu.usal.pantalla.vista.Cliente_ModDel_Vista;
import edu.usal.pantalla.vista.LineaAerea_ModDel_Vista;
import edu.usal.util.IOGeneral;

public class LineaAerea_ModDel_Controller {
		
	LineaAerea_ModDel_Vista menuModDel;
	LineaAerea_Datos_Controller menuDatos;
	MenuPrincipalController mPController;
	private LineaAereaDAO lineaaereadao;
	
	public LineaAerea_ModDel_Controller(MenuPrincipalController menuPrincipalController) {
		this.mPController= menuPrincipalController;
		menuModDel = new LineaAerea_ModDel_Vista(this);
	}
	

	public MenuPrincipalController getmPController() {
		return mPController;
	}

	public void setmPController(MenuPrincipalController mPController) {
		this.mPController = mPController;
	}
	
	public void finalizarVentana() {
				menuModDel.dispose();
	}


	public DefaultListModel<LineaAerea> pedirListaLineaAerea() {
		try {
			lineaaereadao = new LineaAereaDAOImplSQL();
			DefaultListModel<LineaAerea> lista = new DefaultListModel<LineaAerea>();
			for(LineaAerea linea: lineaaereadao.getAllLineaAerea()) {
				lista.addElement(linea);				
			}
			return lista;
		} catch (SQLException e) {
			IOGeneral.pritln(">>>>>Error con la base de datos<<<<<");
			IOGeneral.pritln(e.getMessage());
		}
		
		return null;
	}


	public void Eliminar(LineaAerea lineaAerea) {
		int res = menuModDel.confirmarSeleccion(lineaAerea, "ELIMINACION");
		if(res==JOptionPane.YES_OPTION) {
			try {
				lineaaereadao = new LineaAereaDAOImplSQL();
				if(lineaaereadao.deleteLineaAerea(lineaAerea)) {
					menuModDel.exitoOperacion();
				}else {
					menuModDel.fracasoOperacion();
				}
			} catch (SQLException e) {
				IOGeneral.pritln(">>>>>Error con la base de datos<<<<<");
				IOGeneral.pritln(e.getMessage());
			}
		}else {
			menuModDel.cancelaOperacion();
		}
		menuModDel.dispose();
		mPController.hacerVisibleMP();
	}
	
	public void Modificar(LineaAerea lineaAerea) {
		int res = menuModDel.confirmarSeleccion(lineaAerea, "MODIFICACION");
		if(res==JOptionPane.YES_OPTION) {
			menuDatos = new LineaAerea_Datos_Controller(mPController, lineaAerea);
		}
		menuModDel.dispose();
		mPController.hacerVisibleMP();
	}
	
}
