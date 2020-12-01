package edu.usal.pantalla.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.pantalla.controller.Cliente_ModDel_Controller;
import edu.usal.pantalla.vista.eventos.CapturaBtnCliente_ModDel;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

public class Cliente_ModDel_Vista extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Cliente_ModDel_Controller control;
	DefaultListModel<Cliente> modelo;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnMenuPrincipal;
	JList<Cliente> list;
	

	public Cliente_ModDel_Vista(Cliente_ModDel_Controller controller) {
		this.control=controller;
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
        setBounds(100, 100, 954, 565);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSeleccioneUnaCliente = new JLabel("Seleccione una cliente para la operacion");
		lblSeleccioneUnaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSeleccioneUnaCliente, BorderLayout.NORTH);
		modelo = control.pedirListaClientes();
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 6, 0, 0));
		
		btnMenuPrincipal = new JButton("Volver al Menu Principal");
		btnMenuPrincipal.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenuPrincipal.addActionListener(new CapturaBtnCliente_ModDel(this));
		panel.add(btnMenuPrincipal);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new CapturaBtnCliente_ModDel(this));
		panel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new CapturaBtnCliente_ModDel(this));
		panel.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		list = new JList<Cliente>();
		scrollPane.setViewportView(list);
		modelo= control.pedirListaClientes();
		list.setModel(modelo);
		setVisible(true);
	}

	public Cliente_ModDel_Controller getControl() {
		return control;
	}

	public void setControl(Cliente_ModDel_Controller control) {
		this.control = control;
	}

	public JList<Cliente> getList() {
		return list;
	}

	public void setList(JList<Cliente> list) {
		this.list = list;
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

	public DefaultListModel<Cliente> getModelo() {
		return modelo;
	}

	public void setModelo(DefaultListModel<Cliente> modelo) {
		this.modelo = modelo;
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
	
	public int confirmarSeleccion(Cliente cliente,String causa) {
		return JOptionPane.showConfirmDialog(null, ("Desea seleccionar para su "+causa+" a\n Apellido: "+cliente.getApellido()+"\nNombre: "+cliente.getNombre()+"\nDNI: ["+cliente.getDNI()+"]"), "Confirmacion de seleccion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	}

}
