package edu.usal.pantalla.vista.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.pantalla.vista.Cliente_ModDel_Vista;
import edu.usal.pantalla.vista.Cliente_Datos_Vista;

public class CapturaBtnCliente_ModDel implements ActionListener {

	Cliente_ModDel_Vista vista;
	
	public CapturaBtnCliente_ModDel(Cliente_ModDel_Vista vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(vista.getBtnModificar())) {
			int index=vista.getList().getSelectedIndex();
			vista.getControl().Modificar(vista.getModelo().getElementAt(index));
		}else if(e.getSource().equals(vista.getBtnEliminar())) {
			int index=vista.getList().getSelectedIndex();
			vista.getControl().Eliminar(vista.getModelo().getElementAt(index));
		}else if(e.getSource().equals(vista.getBtnMenuPrincipal())) {
			vista.getControl().getmPController().hacerVisibleMP();
			vista.dispose();
			
		}

	}

}
