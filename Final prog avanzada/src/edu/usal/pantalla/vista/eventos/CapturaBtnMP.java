package edu.usal.pantalla.vista.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.pantalla.vista.MenuPrincipalVista;

public class CapturaBtnMP implements ActionListener {
	MenuPrincipalVista vista;
	
	public CapturaBtnMP(MenuPrincipalVista vista) {
		this.vista = vista;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(vista.getBtn_Cliente_Nuevo())){
			vista.getMpController().EjecutarSubmenuCliente(1);
		} else if(e.getSource().equals(vista.getBtn_Cliente_Ver())){
			vista.getMpController().EjecutarSubmenuCliente(2);
		}
				
		if(e.getSource().equals(vista.getBtn_Aerolinea_Nuevo())){
			vista.getMpController().EjecutarSubmenuAerolinea(1);
		} else if(e.getSource().equals(vista.getBtn_Aerolinea_Ver())){
			vista.getMpController().EjecutarSubmenuAerolinea(2);
		}
		
		if(e.getSource().equals(vista.getBtn_Venta_Nuevo())){
			vista.getMpController().EjecutarSubmenuVenta(1);
		} else if(e.getSource().equals(vista.getBtn_Venta_Ver())){
			vista.getMpController().EjecutarSubmenuVenta(2);
		}
		
		if(e.getSource().equals(vista.getBtn_Vuelo_Nuevo())){
			vista.getMpController().EjecutarSubmenuVuelo(1);
		} else if(e.getSource().equals(vista.getBtn_Cliente_Ver())){
			vista.getMpController().EjecutarSubmenuVuelo(2);
		}
		
		
		if(e.getSource().equals(vista.getBtnSalir())){
			vista.getMpController().Salir();
		}
				
				
	}

}
