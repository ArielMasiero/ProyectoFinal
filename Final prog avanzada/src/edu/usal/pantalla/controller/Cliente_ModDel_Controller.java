package edu.usal.pantalla.controller;

import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import edu.usal.negocio.dao.implementacion.SQL.ClienteDAOImplSQL;
import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.pantalla.vista.Cliente_ModDel_Vista;
import edu.usal.util.IOGeneral;

public class Cliente_ModDel_Controller {
		
	Cliente_ModDel_Vista menuModDel;
	Cliente_Datos_Controller menuDatos;
	MenuPrincipalController mPController;
	private ClienteDAO clientedao;
	
	public Cliente_ModDel_Controller(MenuPrincipalController menuPrincipalController) {
		this.mPController= menuPrincipalController;
		menuModDel = new Cliente_ModDel_Vista(this);
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


	public DefaultListModel<Cliente> pedirListaClientes() {
		try {
			clientedao = new ClienteDAOImplSQL();
			DefaultListModel<Cliente> lista = new DefaultListModel<Cliente>();
			for(Cliente cliente: clientedao.getAllCliente()) {
				lista.addElement(cliente);				
			}
			return lista;
		} catch (SQLException e) {
			IOGeneral.pritln(">>>>>Error con la base de datos<<<<<");
			IOGeneral.pritln(e.getMessage());
		}
		
		return null;
	}


	public void Eliminar(Cliente cliente) {
		int res = menuModDel.confirmarSeleccion(cliente, "ELIMINACION");
		if(res==JOptionPane.YES_OPTION) {
			try {
				clientedao = new ClienteDAOImplSQL();
				if(clientedao.deleteCliente(cliente)) {
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
	}
	
	public void Modificar(Cliente cliente) {
		int res = menuModDel.confirmarSeleccion(cliente, "MODIFICACION");
		if(res==JOptionPane.YES_OPTION) {
			menuDatos = new Cliente_Datos_Controller(mPController, cliente);
		}
	}
	
}
