package edu.usal.pantalla.vista.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.pantalla.vista.Cliente_Datos_Vista;

public class CapturaBtnCliente_Datos implements ActionListener {

	Cliente_Datos_Vista vista;
	
	public CapturaBtnCliente_Datos(Cliente_Datos_Vista vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(vista.getBtnGuardar())) {
			vista.getController().almacenarDatos(vista);
		}else if(e.getSource().equals(vista.getBtnCancelar())) {
			vista.getController().getmPController().hacerVisibleMP();
			vista.getController().finalizarVentana();
		}

	}

}
