package edu.usal.pantalla.vista;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.pantalla.controller.MenuPrincipalController;
import edu.usal.pantalla.vista.eventos.CapturaBtnMP;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.UIManager;

public class MenuPrincipalVista extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	MenuPrincipalController mpController;
	
	private JPanel contentPane;
	private JLabel lblAerolinea;
	private JButton btnSalir;
	private JButton btn_Cliente_Nuevo;
	private JButton btn_Cliente_Ver;
	private JButton btn_Aerolinea_Nuevo;
	private JButton btn_Aerolinea_Ver;
	private JButton btn_Vuelo_Nuevo;
	private JButton btn_Vuelo_Ver;
	private JButton btn_Venta_Nuevo;
	private JButton btn_Venta_Ver;
	private JButton btnActualizarDatosAerolineas;
	

	public MenuPrincipalController getMpController() {
		return mpController;
	}

	public void setMpController(MenuPrincipalController mpController) {
		this.mpController = mpController;
	}

	public MenuPrincipalVista(MenuPrincipalController mpController) {
		this.mpController = mpController;
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		 
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
		setBounds(100, 100, 738, 735);
		setLocationRelativeTo(null);		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel panel_MenuPrincipal = new JPanel();
		panel_MenuPrincipal.setBackground(new Color(51, 153, 255));
		contentPane.add(panel_MenuPrincipal);
		panel_MenuPrincipal.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblAerolinea = new JLabel("Aeropuerto");
		lblAerolinea.setBackground(new Color(51, 153, 255));
		panel_MenuPrincipal.add(lblAerolinea);
		lblAerolinea.setHorizontalAlignment(SwingConstants.CENTER);
		lblAerolinea.setVerticalAlignment(SwingConstants.TOP);
		lblAerolinea.setFont(new Font("Verdana Pro SemiBold", Font.BOLD, 38));
		
		JLabel lblMenuPrincipal = new JLabel("Menu Principal");
		lblMenuPrincipal.setBackground(new Color(51, 153, 255));
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_MenuPrincipal.add(lblMenuPrincipal);
		
		JPanel panel_Clientes = new JPanel();
		panel_Clientes.setBackground(new Color(51, 153, 255));
		contentPane.add(panel_Clientes);
		panel_Clientes.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Base = new JPanel();
		panel_Base.setBackground(new Color(51, 153, 255));
		panel_Clientes.add(panel_Base, BorderLayout.CENTER);
		panel_Base.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_VacioSupIzq_Cliente = new JPanel();
		panel_VacioSupIzq_Cliente.setBackground(new Color(51, 153, 255));
		panel_Base.add(panel_VacioSupIzq_Cliente);
		
		btn_Cliente_Nuevo = new JButton("Nuevo Cliente");
		btn_Cliente_Nuevo.setBackground(UIManager.getColor("Button.background"));
		btn_Cliente_Nuevo.addActionListener(new CapturaBtnMP(this));
		panel_Base.add(btn_Cliente_Nuevo);
		
		btn_Cliente_Ver = new JButton("Ver Clientes");
		btn_Cliente_Ver.setBackground(UIManager.getColor("Button.background"));
		btn_Cliente_Ver.addActionListener(new CapturaBtnMP(this));
		panel_Base.add(btn_Cliente_Ver);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(51, 153, 255));
		panel_Clientes.add(separator, BorderLayout.SOUTH);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(51, 153, 255));
		panel_Clientes.add(panel_20, BorderLayout.NORTH);
		panel_20.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(51, 153, 255));
		panel_20.add(panel_22);
		
		JLabel label = new JLabel("Gestion de Clientes");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBackground(new Color(51, 153, 255));
		panel_20.add(label);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(51, 153, 255));
		panel_20.add(panel_21);
		
		JPanel panel_Aerolinea = new JPanel();
		panel_Aerolinea.setBackground(new Color(51, 153, 255));
		contentPane.add(panel_Aerolinea);
		panel_Aerolinea.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(51, 153, 255));
		panel_Aerolinea.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_VacioIzq_Aero = new JPanel();
		panel_VacioIzq_Aero.setBackground(new Color(51, 153, 255));
		panel_7.add(panel_VacioIzq_Aero);
		
		btn_Aerolinea_Nuevo = new JButton("Nueva Aerolinea");
		btn_Aerolinea_Nuevo.setBackground(UIManager.getColor("Button.background"));
		btn_Aerolinea_Nuevo.addActionListener(new CapturaBtnMP(this));
		panel_7.add(btn_Aerolinea_Nuevo);
		
		btn_Aerolinea_Ver = new JButton("Ver Aerolineas");
		btn_Aerolinea_Ver.setBackground(UIManager.getColor("Button.background"));
		btn_Aerolinea_Ver.addActionListener(new CapturaBtnMP(this));
		panel_7.add(btn_Aerolinea_Ver);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(51, 153, 255));
		panel_Aerolinea.add(separator_1, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 255));
		panel_Aerolinea.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 153, 255));
		panel.add(panel_1);
		
		JLabel lblGestionDeAerolineas = new JLabel("Gestion de Aerolineas");
		lblGestionDeAerolineas.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDeAerolineas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGestionDeAerolineas.setBackground(new Color(51, 153, 255));
		panel.add(lblGestionDeAerolineas);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 153, 255));
		panel.add(panel_2);
		
		JPanel panel_Vuelo = new JPanel();
		panel_Vuelo.setBackground(new Color(51, 153, 255));
		panel_Vuelo.setForeground(Color.WHITE);
		contentPane.add(panel_Vuelo);
		panel_Vuelo.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(51, 153, 255));
		panel_Vuelo.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_VacioIzq_Vuelo = new JPanel();
		panel_VacioIzq_Vuelo.setBackground(new Color(51, 153, 255));
		panel_8.add(panel_VacioIzq_Vuelo);
		
		btn_Vuelo_Nuevo = new JButton("Nuevo Vuelo");
		btn_Vuelo_Nuevo.setBackground(UIManager.getColor("Button.background"));
		btn_Vuelo_Nuevo.addActionListener(new CapturaBtnMP(this));
		panel_8.add(btn_Vuelo_Nuevo);
		
		btn_Vuelo_Ver = new JButton("Ver Vuelos");
		btn_Vuelo_Ver.setBackground(UIManager.getColor("Button.background"));
		btn_Vuelo_Ver.addActionListener(new CapturaBtnMP(this));
		panel_8.add(btn_Vuelo_Ver);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(51, 153, 255));
		panel_Vuelo.add(separator_2, BorderLayout.SOUTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(51, 153, 255));
		panel_Vuelo.add(panel_6, BorderLayout.NORTH);
		panel_6.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(51, 153, 255));
		panel_6.add(panel_9);
		
		JLabel label_1 = new JLabel("Gestion de Vuelos");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBackground(new Color(51, 153, 255));
		panel_6.add(label_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(51, 153, 255));
		panel_6.add(panel_11);
		
		JPanel panel_Ventas = new JPanel();
		panel_Ventas.setBackground(new Color(51, 153, 255));
		contentPane.add(panel_Ventas);
		panel_Ventas.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(51, 153, 255));
		panel_Ventas.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_VacioIzq_Ventas = new JPanel();
		panel_VacioIzq_Ventas.setBackground(new Color(51, 153, 255));
		panel_10.add(panel_VacioIzq_Ventas);
		
		btn_Venta_Nuevo = new JButton("Nueva Venta");
		btn_Venta_Nuevo.setBackground(UIManager.getColor("Button.background"));
		btn_Venta_Nuevo.addActionListener(new CapturaBtnMP(this));
		panel_10.add(btn_Venta_Nuevo);
		
		btn_Venta_Ver = new JButton("Ver Ventas");
		btn_Venta_Ver.setBackground(UIManager.getColor("Button.background"));
		btn_Venta_Ver.addActionListener(new CapturaBtnMP(this));
		panel_10.add(btn_Venta_Ver);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 153, 255));
		panel_Ventas.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 153, 255));
		panel_3.add(panel_4);
		
		JLabel lblGestionDeVentas = new JLabel("Gestion de Ventas");
		lblGestionDeVentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDeVentas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGestionDeVentas.setBackground(new Color(51, 153, 255));
		panel_3.add(lblGestionDeVentas);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(51, 153, 255));
		panel_3.add(panel_5);
		
		JPanel panel_Sur = new JPanel();
		panel_Sur.setBackground(new Color(51, 153, 255));
		contentPane.add(panel_Sur);
		panel_Sur.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_Sur.add(panel_14, BorderLayout.SOUTH);
		panel_14.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(51, 153, 255));
		panel_14.add(panel_15);
		panel_15.setLayout(new GridLayout(0, 2, 0, 0));
		
		btnSalir = new JButton("Salir");
		btnSalir.setBackground(UIManager.getColor("Button.background"));
		panel_15.add(btnSalir);
		btnSalir.addActionListener(new CapturaBtnMP(this));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(51, 153, 255));
		panel_14.add(panel_16);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(51, 153, 255));
		panel_14.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(51, 153, 255));
		panel_14.add(panel_19);
		
		btnActualizarDatosAerolineas = new JButton("Actualizar Datos Aerolineas");
		btnActualizarDatosAerolineas.setBackground(UIManager.getColor("Button.background"));
		panel_14.add(btnActualizarDatosAerolineas);
		
		this.setVisible(true);
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtn_Cliente_Nuevo() {
		return btn_Cliente_Nuevo;
	}

	public void setBtn_Cliente_Nuevo(JButton btn_Cliente_Nuevo) {
		this.btn_Cliente_Nuevo = btn_Cliente_Nuevo;
	}

	public JButton getBtn_Cliente_Buscar() {
		return btn_Cliente_Ver;
	}

	public void setBtn_Cliente_Buscar(JButton btn_Cliente_Buscar) {
		this.btn_Cliente_Ver = btn_Cliente_Buscar;
	}

	

	public JButton getBtn_Cliente_Ver() {
		return btn_Cliente_Ver;
	}

	public void setBtn_Cliente_Ver(JButton btn_Cliente_Ver) {
		this.btn_Cliente_Ver = btn_Cliente_Ver;
	}

	

	public JButton getBtn_Aerolinea_Nuevo() {
		return btn_Aerolinea_Nuevo;
	}

	public void setBtn_Aerolinea_Nuevo(JButton btn_Aerolinea_Nuevo) {
		this.btn_Aerolinea_Nuevo = btn_Aerolinea_Nuevo;
	}

	public JButton getBtn_Aerolinea_Ver() {
		return btn_Aerolinea_Ver;
	}

	public void setBtn_Aerolinea_Ver(JButton btn_Aerolinea_Ver) {
		this.btn_Aerolinea_Ver = btn_Aerolinea_Ver;
	}

	public JButton getBtn_Vuelo_Nuevo() {
		return btn_Vuelo_Nuevo;
	}

	public void setBtn_Vuelo_Nuevo(JButton btn_Vuelo_Nuevo) {
		this.btn_Vuelo_Nuevo = btn_Vuelo_Nuevo;
	}

	public JButton getBtn_Vuelo_Ver() {
		return btn_Vuelo_Ver;
	}

	public void setBtn_Vuelo_Ver(JButton btn_Vuelo_Ver) {
		this.btn_Vuelo_Ver = btn_Vuelo_Ver;
	}

	public JButton getBtn_Venta_Nuevo() {
		return btn_Venta_Nuevo;
	}

	public void setBtn_Venta_Nuevo(JButton btn_Venta_Nuevo) {
		this.btn_Venta_Nuevo = btn_Venta_Nuevo;
	}

	public JButton getBtn_Venta_Ver() {
		return btn_Venta_Ver;
	}

	public void setBtn_Venta_Ver(JButton btn_Venta_Ver) {
		this.btn_Venta_Ver = btn_Venta_Ver;
	}

	public JButton getBtnActualizarDatosAerolineas() {
		return btnActualizarDatosAerolineas;
	}

	public void setBtnActualizarDatosAerolineas(JButton btnActualizarDatosAerolineas) {
		this.btnActualizarDatosAerolineas = btnActualizarDatosAerolineas;
	}
	public int confirmarSalida() {
		if(JOptionPane.showConfirmDialog(null, ("¿Desea realmente salir del sistema?"), "Confirmacion de seleccion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
			return EXIT_ON_CLOSE;
		}
		return JFrame.DO_NOTHING_ON_CLOSE;
		
	}
	
	private void close(){
        if (JOptionPane.showConfirmDialog(null, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }  
	
}
