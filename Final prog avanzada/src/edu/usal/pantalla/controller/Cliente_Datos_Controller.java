package edu.usal.pantalla.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

import edu.usal.negocio.dao.factory.ClienteFactory;
import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Direccion;
import edu.usal.negocio.dominio.LineaAerea;
import edu.usal.negocio.dominio.Pais;
import edu.usal.negocio.dominio.PasajeroFrecuente;
import edu.usal.negocio.dominio.Pasaporte;
import edu.usal.negocio.dominio.Provincia;
import edu.usal.negocio.dominio.Telefono;
import edu.usal.pantalla.vista.Cliente_Datos_Vista;
import edu.usal.util.DatosEstaticos;
import edu.usal.util.IOGeneral;

public class Cliente_Datos_Controller {
		
	Cliente_Datos_Vista menu;
	MenuPrincipalController mPController;
	private ClienteDAO clientedao;
	
	public Cliente_Datos_Controller(MenuPrincipalController menuPrincipalController) {
		this.mPController= menuPrincipalController;
		menu = new Cliente_Datos_Vista(this);
	}
	
	public Cliente_Datos_Controller(MenuPrincipalController menuPrincipalController, Cliente cliente) {
		this.mPController= menuPrincipalController;
		menu = new Cliente_Datos_Vista(this , cliente);
		
	}

	/*public void pedirDNI() {
		try {
			clientedao = ClienteFactory.getClienteDAO(DatosEstaticos.getSource());
			Cliente selec =clientedao.readCliente(mPController.getMenuVista().solicitarDNI(" modificar "));
			if(selec.getDNI()==null) {
				mPController.getMenuVista().clienteNoEncontrado();
			}else {
				menu = new Cliente_Datos_Vista(this, selec);
			}
		} catch (SQLException e) {
			IOGeneral.pritln(">>>>>Error con la base de datos<<<<<");
			IOGeneral.pritln(e.getMessage());
		}
	}*/
	
	
	public void almacenarDatos(Cliente_Datos_Vista datos) {
		System.out.println("Datos recibidos");
		
		if(guardarCliente(datos)) {
			menu.exitoOperacion();
		}else {
			menu.fracasoOperacion();
		}
		menu.dispose();
		mPController.hacerVisibleMP();
		//menu.setNuevoCliente(new FrameNuevoCliente(menu));
		//menu.getNuevoCliente().setBounds(5, 53, 969, 590);
		
		IOGeneral.pritln(">>>>>Proceso OK<<<<<");
	}
	
	@SuppressWarnings("deprecation")
	private boolean guardarCliente(Cliente_Datos_Vista datos) {
		clientedao = ClienteFactory.getClienteDAO(DatosEstaticos.getSource());
		Cliente cliente = new Cliente();
		cliente.setNombre(datos.getTextNombre().getText());
		cliente.setApellido(datos.getTextApellido().getText());
		cliente.setDNI(Integer.parseInt((datos.getTextDNI().getText())));
		cliente.setCuitcuil(datos.getTextCuit().getText());
		cliente.setEmail(datos.getTextEmail().getText());
		cliente.setFechaNac(new Date(Integer.parseInt((String)datos.getComboBox_FechaNacYYYY().getSelectedItem()), Integer.parseInt((String)datos.getComboBox_FechaNacMM().getSelectedItem()), Integer.parseInt((String)datos.getComboBox_FechaNacDD().getSelectedItem())));
		
		cliente.setTelefono(new Telefono(datos.getTextTelPersonal().getText(), datos.getTextTelCelular().getText(), datos.getTextTelLaboral().getText()));
		
		cliente.setDireccion(obtenerDireccion(datos));
		
		cliente.setPasaporte(obtenerPasaporte(datos));
		
		cliente.setPasajeroFrecuente(obtenerPasajeroFrecuente(datos));
		
		try {
			if(clientedao.addCliente(cliente)) {
				
				return true;
			}
		} catch (SQLException e) {
			IOGeneral.pritln(">>>>>Error con la base de datos<<<<<");
			IOGeneral.pritln(e.getMessage());
		}
		return false;
	}	

	public MenuPrincipalController getmPController() {
		return mPController;
	}

	public void setmPController(MenuPrincipalController mPController) {
		this.mPController = mPController;
	}
	
	
	
	
	private Direccion obtenerDireccion(Cliente_Datos_Vista datos) {
		Direccion direc = new Direccion();
		direc.setPais((Pais)datos.getComboBox_Pais().getSelectedItem());
		if(direc.getPais().getId()==9) {
			direc.setProvincia((Provincia)datos.getComboBox_Provincia().getSelectedItem());
		}
		direc.setCiudad(datos.getTextCiudad().getText());
		direc.setCodPostal(datos.getTextCodPostal().getText());
		direc.setCalle(datos.getTextCalle().getText());
		direc.setAltura(datos.getTextAltura().getText());
		return direc;
	}
	@SuppressWarnings("deprecation")
	private Pasaporte obtenerPasaporte(Cliente_Datos_Vista datos) {
		Pasaporte pasa = new Pasaporte();
		pasa.setAutoridademision(datos.getTextAutoridadEmision().getText());
		pasa.setNroPasaporte(datos.getTextNroPasaporte().getText());
		pasa.setPais((Pais)datos.getComboBox_PaisEmision().getSelectedItem());
		pasa.setEmision(new Date(Integer.parseInt((String)datos.getComboBox_FechaEmiYYYY().getSelectedItem()), Integer.parseInt((String)datos.getComboBox_FechaEmiMM().getSelectedItem()), Integer.parseInt((String)datos.getComboBox_FechaEmiDD().getSelectedItem())));
		pasa.setVencimiento(new Date(Integer.parseInt((String)datos.getComboBox_FechaVencYYYY().getSelectedItem()), Integer.parseInt((String)datos.getComboBox_FechaVencMM().getSelectedItem()), Integer.parseInt((String)datos.getComboBox_FechaVencDD().getSelectedItem())));
		return pasa;
	}
	private PasajeroFrecuente obtenerPasajeroFrecuente(Cliente_Datos_Vista datos) {
		return new PasajeroFrecuente(((LineaAerea)datos.getComboBox_Aerolinea().getSelectedItem()).getAlianza(), ((LineaAerea)datos.getComboBox_Aerolinea().getSelectedItem()).getId(), datos.getTextNroPasajero().getText(), datos.getTextCategoria().getText());
	}
	
	public Pais[] obtenerListaPaises() {	
		Hashtable<Integer, String> lista= DatosEstaticos.getPaises();
		Pais[] modelo = new Pais[(lista.size()+1)];
		modelo[0]= new Pais(-1,"Seleccione un pais");
		for (int i=1; i<lista.size();i++) {
			modelo[i+1]=new Pais(i,lista.get(i));
		}
		modelo[lista.size()] = new Pais(0,lista.get(0));
		return modelo;
	}

	public Provincia[] obtenerListaProvincias() {
		Hashtable<Integer, String> lista= DatosEstaticos.getProvincias();
		Provincia[] modelo = new Provincia[(lista.size()+1)];
		modelo[0]= new Provincia(-1,"Seleccione una provincia");
		for (int i=1; i<lista.size();i++) {
			modelo[i+1]=new Provincia(i,lista.get(i));
		}
		modelo[lista.size()] = new Provincia(0,lista.get(0));
		return modelo;
}

	public LineaAerea[] obtenerListaAerolinea() {
		/*LineaAerea[] lista = DatosEstaticos.getAerolineas();
		LineaAerea[] modelo = new LineaAerea[lista.length+1];
		modelo[0]= new LineaAerea();
		modelo[0].setNombre("Seleccione una aerolinea");
		for (int i=1; i<lista.length;i++) {
			modelo[i+1]= lista[i];
		}
		return modelo;*/
		ArrayList<LineaAerea> lista= DatosEstaticos.getAerolineas();
		LineaAerea[] modelo = new LineaAerea[(lista.size()+1)];
		int i=0;
		modelo[i]= new LineaAerea();
		modelo[i].setNombre("Seleccione una Aerolinea");
		i++;
		for (LineaAerea linea : lista) {
			modelo[i]=lista.get(i-1);
			i++;
		}
		return modelo;
	}
	public void finalizarVentana() {
				menu.dispose();
	}
	
}
