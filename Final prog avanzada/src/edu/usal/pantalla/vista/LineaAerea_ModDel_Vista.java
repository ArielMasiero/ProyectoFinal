package edu.usal.pantalla.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineaAerea;
import edu.usal.pantalla.controller.LineaAerea_ModDel_Controller;
import edu.usal.pantalla.vista.eventos.CapturaBtnLineaAerea_ModDel;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class LineaAerea_ModDel_Vista extends JFrame {

	
	private static final long serialVersionUID = 1L;
	LineaAerea_ModDel_Controller control;
	private JPanel contentPane;
	DefaultListModel<LineaAerea> modelo;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnMenuPrincipal;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JList<LineaAerea> list;
	private JPanel panel_3;
	

	
	public LineaAerea_ModDel_Vista(LineaAerea_ModDel_Controller lineaAerea_ModDel_Controller) {
		setTitle("Ver Aerolineas");
		this.control = lineaAerea_ModDel_Controller;
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
		setBounds(100, 100, 352, 525);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblSeleccioneUnaAerolinea = new JLabel("Seleccione una Aerolinea");
		panel.add(lblSeleccioneUnaAerolinea);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_1 = new JPanel();
		panel_2.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new CapturaBtnLineaAerea_ModDel(this));
		panel_1.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		panel_1.add(btnEliminar);
		btnEliminar.addActionListener(new CapturaBtnLineaAerea_ModDel(this));
		
		btnMenuPrincipal = new JButton("Volver al menu principal");
		btnMenuPrincipal.addActionListener(new CapturaBtnLineaAerea_ModDel(this));
		panel_2.add(btnMenuPrincipal);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		list = new JList<LineaAerea>();
		scrollPane.setViewportView(list);
		modelo = control.pedirListaLineaAerea();
		list.setModel(modelo);
		setVisible(true);
	}
	
	
	
	public LineaAerea_ModDel_Controller getControl() {
		return control;
	}



	public void setControl(LineaAerea_ModDel_Controller control) {
		this.control = control;
	}



	public JList<LineaAerea> getList() {
		return list;
	}



	public void setList(JList<LineaAerea> list) {
		this.list = list;
	}



	public DefaultListModel<LineaAerea> getModelo() {
		return modelo;
	}



	public void setModelo(DefaultListModel<LineaAerea> modelo) {
		this.modelo = modelo;
	}



	public JButton getBtnModificar() {
		return btnModificar;
	}



	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}



	public JButton getBtnEliminar() {
		return btnEliminar;
	}



	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}



	public JButton getBtnMenuPrincipal() {
		return btnMenuPrincipal;
	}



	public void setBtnMenuPrincipal(JButton btnMenuPrincipal) {
		this.btnMenuPrincipal = btnMenuPrincipal;
	}



	public void cancelaOperacion() {
		JOptionPane.showMessageDialog(null, "La operacion se ha cancelado", "", JOptionPane.WARNING_MESSAGE);
	}
	public void exitoOperacion() {
		JOptionPane.showMessageDialog(null, "La operacion se ha completado con exito", "", JOptionPane.INFORMATION_MESSAGE);
	}
	public void fracasoOperacion() {
		JOptionPane.showMessageDialog(null, "La operacion no se pudo realizar", "", JOptionPane.WARNING_MESSAGE);
	}
	private void close(){
        if (JOptionPane.showConfirmDialog(null, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    } 
	
	public int confirmarSeleccion(LineaAerea lineaAerea,String causa) {
		return JOptionPane.showConfirmDialog(null, ("Desea seleccionar para su "+causa+" a\n Aerolinea: "+lineaAerea.getNombre()+"\nAlianza: "+lineaAerea.getAlianza()+"\nID: ["+lineaAerea.getId()+"]"), "Confirmacion de seleccion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	}
	
}
