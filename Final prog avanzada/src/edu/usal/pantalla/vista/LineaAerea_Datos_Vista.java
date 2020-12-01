package edu.usal.pantalla.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.usal.negocio.dominio.LineaAerea;
import edu.usal.pantalla.controller.LineaAerea_Datos_Controller;
import edu.usal.pantalla.vista.eventos.CapturaBtnLineaAerea_Datos;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LineaAerea_Datos_Vista extends JFrame {

	private LineaAerea_Datos_Controller control;
	private JPanel contentPane;
	private JTextField textNombre;
	private JComboBox<String> comboBoxAlianza;
	private JLabel lblID_Asignado;
	private JButton btnCancelar;
	private JButton btnGuardar;

	/**
	 * @wbp.parser.constructor
	 */
	public LineaAerea_Datos_Vista(LineaAerea_Datos_Controller control) {
		this.control = control;
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
		setBounds(100, 100, 369, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNuevaLineaAerea = new JLabel("Nueva Linea Aerea");
		panel.add(lblNuevaLineaAerea);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(60, 44, 46, 14);
		panel_1.add(lblNombre);
		
		JLabel lblAlianza = new JLabel("Alianza");
		lblAlianza.setBounds(60, 104, 46, 14);
		panel_1.add(lblAlianza);
		
		textNombre = new JTextField();
		textNombre.setBounds(116, 41, 150, 20);
		panel_1.add(textNombre);
		textNombre.setColumns(10);
		
		comboBoxAlianza = new JComboBox<String>();
		comboBoxAlianza.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccione Alianza","Skyteam", "Oneworld", "Star Alliance"}));
		comboBoxAlianza.setBounds(116, 101, 150, 20);
		panel_1.add(comboBoxAlianza);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(60, 171, 46, 14);
		panel_1.add(lblId);
		
		lblID_Asignado = new JLabel("Asignacion automatica");
		lblID_Asignado.setBounds(125, 171, 132, 14);
		panel_1.add(lblID_Asignado);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 4, 0, 0));
		
		btnCancelar= new JButton("Cancelar");
		btnCancelar.addActionListener(new CapturaBtnLineaAerea_Datos(this));
		panel_2.add(btnCancelar);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new CapturaBtnLineaAerea_Datos(this));
		panel_2.add(btnGuardar);
		setVisible(true);
	}
	public LineaAerea_Datos_Vista(LineaAerea_Datos_Controller control, LineaAerea lineaaerea) {
		this.control = control;
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
		setBounds(100, 100, 369, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNuevaLineaAerea = new JLabel("Nueva Linea Aerea");
		panel.add(lblNuevaLineaAerea);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(60, 44, 46, 14);
		panel_1.add(lblNombre);
		
		JLabel lblAlianza = new JLabel("Alianza");
		lblAlianza.setBounds(60, 104, 46, 14);
		panel_1.add(lblAlianza);
		
		textNombre = new JTextField();
		textNombre.setBounds(116, 41, 150, 20);
		textNombre.setText(lineaaerea.getNombre());
		panel_1.add(textNombre);
		textNombre.setColumns(10);
		
		comboBoxAlianza = new JComboBox<String>();
		comboBoxAlianza.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccione Alianza","Skyteam", "Oneworld", "Star Alliance"}));
		comboBoxAlianza.setBounds(116, 101, 150, 20);
		comboBoxAlianza.setSelectedIndex(lineaaerea.getAlianza());
		panel_1.add(comboBoxAlianza);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(60, 171, 46, 14);
		panel_1.add(lblId);
		
		lblID_Asignado = new JLabel(String.valueOf(lineaaerea.getId()));
		lblID_Asignado.setBounds(125, 171, 132, 14);
		panel_1.add(lblID_Asignado);
				
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 4, 0, 0));
		
		btnCancelar= new JButton("Cancelar");
		btnCancelar.addActionListener(new CapturaBtnLineaAerea_Datos(this));
		panel_2.add(btnCancelar);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new CapturaBtnLineaAerea_Datos(this));
		panel_2.add(btnGuardar);
		setVisible(true);
	}

	public LineaAerea_Datos_Controller getControl() {
		return control;
	}

	public void setControl(LineaAerea_Datos_Controller control) {
		this.control = control;
	}

	public JLabel getLblID_Asignado() {
		return lblID_Asignado;
	}

	public void setLblID_Asignado(JLabel lblID_Asignado) {
		this.lblID_Asignado = lblID_Asignado;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JComboBox<String> getComboBoxAlianza() {
		return comboBoxAlianza;
	}

	public void setComboBoxAlianza(JComboBox<String> comboBoxAlianza) {
		this.comboBoxAlianza = comboBoxAlianza;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
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
}
