package edu.usal.pantalla.controller;

import javax.swing.JFrame;

import edu.usal.pantalla.vista.MenuPrincipalVista;

public class MenuPrincipalController{
		private MenuPrincipalVista menuPrincipal;
		private Cliente_ModDel_Controller menuModCliente;
		private Cliente_Datos_Controller menuDatosCliente;
		private LineaAerea_Datos_Controller menuDatosLineaAerea;
		private LineaAerea_ModDel_Controller menuModLineaAerea;
		
		
		
		public MenuPrincipalController() {
			this.menuPrincipal = new MenuPrincipalVista(this);
		}
		
		public void EjecutarSubmenuCliente(int sb) {
			if(sb==1) {//Nuevo cliente
				this.menuPrincipal.setVisible(false);
				menuDatosCliente = new Cliente_Datos_Controller(this);
			}else if (sb==2) {//Modificar Cliente
				this.menuPrincipal.setVisible(false);
				menuModCliente = new Cliente_ModDel_Controller(this);
			}
		}
		
		public void EjecutarSubmenuAerolinea(int sb) {
			if(sb==1) {//Nuevo Aerolinea
				this.menuPrincipal.setVisible(false);
				menuDatosLineaAerea = new LineaAerea_Datos_Controller(this);
			}else if (sb==2) {//Modificar Aerolinea
				this.menuPrincipal.setVisible(false);
				menuModLineaAerea = new LineaAerea_ModDel_Controller(this);
			}
		}
		public void EjecutarSubmenuVuelo(int sb) {
			if(sb==1) {//Nuevo Vuelo
				this.menuPrincipal.setVisible(false);
				menuDatosCliente = new Cliente_Datos_Controller(this);
			}else if (sb==2) {//Modificar Vuelo
				this.menuPrincipal.setVisible(false);
				menuModCliente = new Cliente_ModDel_Controller(this);
			}
		}
		public void EjecutarSubmenuVenta(int sb) {
			if(sb==1) {//Nuevo Venta
				this.menuPrincipal.setVisible(false);
				menuDatosCliente = new Cliente_Datos_Controller(this);
			}else if (sb==2) {//Modificar Venta
				this.menuPrincipal.setVisible(false);
				menuModCliente = new Cliente_ModDel_Controller(this);
			}
		}
		
		
		public MenuPrincipalVista getMenuPrincipal() {
			return menuPrincipal;
		}

		

		public Cliente_ModDel_Controller getMenuModCliente() {
			return menuModCliente;
		}

		public Cliente_Datos_Controller getMenuDatosCliente() {
			return menuDatosCliente;
		}

		public LineaAerea_Datos_Controller getMenuDatosLineaAerea() {
			return menuDatosLineaAerea;
		}

		public LineaAerea_ModDel_Controller getMenuModLineaAerea() {
			return menuModLineaAerea;
		}

		public void hacerVisibleMP() {
			this.menuPrincipal.setVisible(true);
		}

		public void Salir() {
			if(menuPrincipal.confirmarSalida()==JFrame.EXIT_ON_CLOSE) {
				System.exit(0);
			}
			
		}		
		
}
