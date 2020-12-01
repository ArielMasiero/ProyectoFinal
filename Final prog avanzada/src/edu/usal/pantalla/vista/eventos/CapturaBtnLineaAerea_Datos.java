package edu.usal.pantalla.vista.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.pantalla.vista.Cliente_Datos_Vista;
import edu.usal.pantalla.vista.LineaAerea_Datos_Vista;

public class CapturaBtnLineaAerea_Datos implements ActionListener {

	LineaAerea_Datos_Vista vista;
	
	public CapturaBtnLineaAerea_Datos(LineaAerea_Datos_Vista vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(vista.getBtnGuardar())) {
			vista.getControl().guardarDatos(vista);
		}else if(e.getSource().equals(vista.getBtnCancelar())) {
			
		}

	}

}
