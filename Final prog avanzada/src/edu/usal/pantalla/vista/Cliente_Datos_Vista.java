package edu.usal.pantalla.vista;


import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineaAerea;
import edu.usal.negocio.dominio.Pais;
import edu.usal.negocio.dominio.Provincia;
import edu.usal.pantalla.controller.Cliente_Datos_Controller;
import edu.usal.pantalla.vista.eventos.CapturaBtnCliente_Datos;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Cliente_Datos_Vista extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	Cliente_Datos_Controller vista;
	
	private JPanel contentPane;

	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDni;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField textEmail;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDNI;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JLabel label_8;
	private JLabel lblPais;
	private JLabel lblCiudad;
	private JLabel lblCiudad_1;
	private JTextField textCiudad;
	private JLabel lblCodigoPostal;
	private JTextField textCodPostal;
	private JLabel lblCalle;
	private JTextField textCalle;
	private JLabel lblAltura;
	private JTextField textAltura;
	private JLabel label;
	private JTextField textTelCelular;
	private JTextField textTelLaboral;
	private JTextField textTelPersonal;
	private JTextField textNroPasaporte;
	private JTextField textAutoridadEmision;
	private JTextField textNroPasajero;
	private JTextField textCategoria;
	private JLabel lblPasajeroFrecuente;
	private JLabel lblPasaporte;
	private JLabel lblDatosBasicos;
	private JLabel lblTelefono;
	private JLabel lblDireccion;
	private JTextField textCuit;
	private JComboBox<Pais> comboBox_Pais;
	private JComboBox<Provincia> comboBox_Provincia;
	private JComboBox<Pais> comboBox_PaisEmision;
	private JComboBox<LineaAerea> comboBox_Aerolinea;
	private JLabel label_13;
	private JLabel label_15;
	private JComboBox<String> comboBox_FechaVencYYYY;
	private JComboBox<String> comboBox_FechaVencDD;
	private JComboBox<String> comboBox_FechaVencMM;
	private JComboBox<String> comboBox_FechaNacDD;
	private JComboBox<String> comboBox_FechaNacYYYY;
	private JComboBox<String> comboBox_FechaNacMM;
	private JComboBox<String> comboBox_FechaEmiMM;
	private JComboBox<String> comboBox_FechaEmiDD;
	private JComboBox<String> comboBox_FechaEmiYYYY;
	private ButtonGroup grupoAlianza;
	private JTextField textAlianza;
	
	/**
	 * @wbp.parser.constructor
	 */
	public Cliente_Datos_Vista(Cliente_Datos_Controller vista) {
		
		this.vista = vista;
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
		setBounds(5, 53, 980, 694);
		setLocationRelativeTo(null);
		
		
		setTitle("Alta de Cliente");
		getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(96, 176, 37, 16);
		getContentPane().add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(324, 176, 62, 16);
		getContentPane().add(lblApellido);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(96, 223, 126, 16);
		getContentPane().add(lblDni);
		
		label_4 = new JLabel("Fecha de Nacimiento");
		label_4.setBounds(24, 276, 126, 16);
		getContentPane().add(label_4);
		
		label_5 = new JLabel("E-mail");
		label_5.setBounds(324, 223, 35, 16);
		getContentPane().add(label_5);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(242, 203, 208, 22);
		getContentPane().add(textEmail);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(14, 154, 208, 22);
		getContentPane().add(textNombre);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(242, 154, 208, 22);
		getContentPane().add(textApellido);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(14, 201, 210, 22);
		getContentPane().add(textDNI);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new CapturaBtnCliente_Datos(this));
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new CapturaBtnCliente_Datos(this));
		btnCancelar.setBounds(822, 602, 97, 25);
		getContentPane().add(btnCancelar);
		btnGuardar.setBounds(698, 601, 97, 25);
		getContentPane().add(btnGuardar);

		label_8 = new JLabel("-");
		label_8.setBounds(133, 250, 17, 16);
		getContentPane().add(label_8);
		
		lblPais = new JLabel("Pais");
		lblPais.setBounds(110, 491, 26, 16);
		getContentPane().add(lblPais);
		
		lblCiudad = new JLabel("Provincia");
		lblCiudad.setBounds(324, 491, 54, 16);
		getContentPane().add(lblCiudad);
		
		lblCiudad_1 = new JLabel("Ciudad");
		lblCiudad_1.setBounds(96, 537, 37, 16);
		getContentPane().add(lblCiudad_1);
		
		textCiudad = new JTextField();
		textCiudad.setColumns(10);
		textCiudad.setBounds(14, 513, 208, 22);
		getContentPane().add(textCiudad);
		
		lblCodigoPostal = new JLabel("Codigo Postal");
		lblCodigoPostal.setBounds(263, 537, 96, 16);
		getContentPane().add(lblCodigoPostal);
		
		textCodPostal = new JTextField();
		textCodPostal.setColumns(10);
		textCodPostal.setBounds(242, 513, 107, 22);
		getContentPane().add(textCodPostal);
		
		lblCalle = new JLabel("Calle");
		lblCalle.setBounds(107, 587, 26, 16);
		getContentPane().add(lblCalle);
		
		textCalle = new JTextField();
		textCalle.setColumns(10);
		textCalle.setBounds(14, 563, 208, 22);
		getContentPane().add(textCalle);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(277, 587, 37, 16);
		getContentPane().add(lblAltura);
		
		textAltura = new JTextField();
		textAltura.setColumns(10);
		textAltura.setBounds(242, 563, 107, 22);
		getContentPane().add(textAltura);
		
		label = new JLabel("-");
		label.setBounds(67, 249, 17, 16);
		getContentPane().add(label);
		
		textTelCelular = new JTextField();
		textTelCelular.setColumns(10);
		textTelCelular.setBounds(242, 330, 208, 22);
		getContentPane().add(textTelCelular);
		
		JLabel lblTelCelular = new JLabel("Tel. Celular");
		lblTelCelular.setBounds(324, 354, 78, 16);
		getContentPane().add(lblTelCelular);
		
		textTelLaboral = new JTextField();
		textTelLaboral.setColumns(10);
		textTelLaboral.setBounds(14, 383, 208, 22);
		getContentPane().add(textTelLaboral);
		
		JLabel lblTelLaboral = new JLabel("Tel. Laboral");
		lblTelLaboral.setBounds(71, 407, 97, 16);
		getContentPane().add(lblTelLaboral);
		
		textTelPersonal = new JTextField();
		textTelPersonal.setColumns(10);
		textTelPersonal.setBounds(14, 330, 208, 22);
		getContentPane().add(textTelPersonal);
		
		JLabel lblTelPersonal = new JLabel("Tel. Personal");
		lblTelPersonal.setBounds(71, 354, 97, 16);
		getContentPane().add(lblTelPersonal);
		
		JLabel label_1 = new JLabel("Numero de Pasaporte");
		label_1.setBounds(560, 176, 126, 16);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Autoridad de Emision");
		label_2.setBounds(793, 176, 126, 16);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Fecha de Emision");
		label_3.setBounds(526, 233, 126, 16);
		getContentPane().add(label_3);
		
		JLabel label_6 = new JLabel("Pais de Emision");
		label_6.setBounds(805, 226, 114, 16);
		getContentPane().add(label_6);
		
		textNroPasaporte = new JTextField();
		textNroPasaporte.setColumns(10);
		textNroPasaporte.setBounds(526, 154, 198, 22);
		getContentPane().add(textNroPasaporte);
		
		textAutoridadEmision = new JTextField();
		textAutoridadEmision.setColumns(10);
		textAutoridadEmision.setBounds(743, 154, 199, 22);
		getContentPane().add(textAutoridadEmision);
		
		JLabel label_9 = new JLabel("Aerolinea");
		label_9.setBounds(607, 446, 72, 16);
		getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Alianza");
		label_10.setBounds(607, 491, 45, 16);
		getContentPane().add(label_10);
		
		JLabel lblNumeroPasajero = new JLabel("Numero Pasajero");
		lblNumeroPasajero.setBounds(586, 407, 126, 16);
		getContentPane().add(lblNumeroPasajero);
		
		textNroPasajero = new JTextField();
		textNroPasajero.setColumns(10);
		textNroPasajero.setBounds(526, 386, 198, 22);
		getContentPane().add(textNroPasajero);
		
		JLabel label_12 = new JLabel("Categoria");
		label_12.setBounds(816, 407, 85, 16);
		getContentPane().add(label_12);
		
		textCategoria = new JTextField();
		textCategoria.setColumns(10);
		textCategoria.setBounds(743, 386, 199, 22);
		getContentPane().add(textCategoria);
		
		JLabel label_14 = new JLabel("Fecha de Vencimiento");
		label_14.setBounds(526, 308, 126, 16);
		getContentPane().add(label_14);
		
		lblPasajeroFrecuente = new JLabel("Pasajero Frecuente");
		lblPasajeroFrecuente.setBounds(516, 358, 221, 17);
		getContentPane().add(lblPasajeroFrecuente);
		
		lblPasaporte = new JLabel("Pasaporte");
		lblPasaporte.setBounds(526, 123, 138, 16);
		getContentPane().add(lblPasaporte);
		
		lblDatosBasicos = new JLabel("Datos Basicos");
		lblDatosBasicos.setBounds(14, 123, 221, 16);
		getContentPane().add(lblDatosBasicos);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(14, 308, 221, 16);
		getContentPane().add(lblTelefono);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(14, 446, 221, 16);
		getContentPane().add(lblDireccion);
		
		JLabel lblCuitcuil = new JLabel("CUIT/CUIL");
		lblCuitcuil.setBounds(306, 277, 72, 14);
		getContentPane().add(lblCuitcuil);
		
		comboBox_Pais = new JComboBox<Pais>();
		comboBox_Pais.setBounds(14, 468, 208, 20);
		comboBox_Pais.setModel(new DefaultComboBoxModel<Pais>(vista.obtenerListaPaises()));
		getContentPane().add(comboBox_Pais);
		
		comboBox_Provincia = new JComboBox<Provincia>();
		comboBox_Provincia.setBounds(242, 468, 208, 20);
		comboBox_Provincia.setModel(new DefaultComboBoxModel<Provincia>(vista.obtenerListaProvincias()));
		getContentPane().add(comboBox_Provincia);
		
		comboBox_PaisEmision = new JComboBox<Pais>();
		comboBox_PaisEmision.setModel(new DefaultComboBoxModel<Pais>(vista.obtenerListaPaises()));
		comboBox_PaisEmision.setBounds(743, 204, 199, 20);
		getContentPane().add(comboBox_PaisEmision);
		
		JLabel lbl_Alianza = new JLabel("");
		lbl_Alianza.setBounds(691, 492, 122, 14);
		getContentPane().add(lbl_Alianza);
		
		comboBox_Aerolinea = new JComboBox<LineaAerea>();
		comboBox_Aerolinea.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Integer seleccion=((LineaAerea)comboBox_Aerolinea.getSelectedItem()).getAlianza();
				if(seleccion==1) {
					lbl_Alianza.setText("Skyteam");
				}else if (seleccion==2) {
					lbl_Alianza.setText("Oneworld");
				}else if (seleccion==3) {
					lbl_Alianza.setText("Star Alliance");
				}else {
					lbl_Alianza.setText("");
				}
			}
		});
		comboBox_Aerolinea.setModel(new DefaultComboBoxModel<LineaAerea>(vista.obtenerListaAerolinea()));
		comboBox_Aerolinea.setBounds(686, 446, 233, 22);
		getContentPane().add(comboBox_Aerolinea);
		
		comboBox_FechaNacYYYY = new JComboBox<String>();
		comboBox_FechaNacYYYY.setModel(new DefaultComboBoxModel<String>(new String[] {"YYYY", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_FechaNacYYYY.setBounds(147, 245, 62, 20);
		getContentPane().add(comboBox_FechaNacYYYY);
		
		comboBox_FechaNacDD = new JComboBox<String>();
		comboBox_FechaNacDD.setModel(new DefaultComboBoxModel<String>(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_FechaNacDD.setBounds(14, 245, 47, 20);
		getContentPane().add(comboBox_FechaNacDD);
		
		comboBox_FechaNacMM = new JComboBox<String>();
		comboBox_FechaNacMM.setModel(new DefaultComboBoxModel<String>(new String[] {"MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_FechaNacMM.setBounds(79, 245, 47, 20);
		getContentPane().add(comboBox_FechaNacMM);
		
		comboBox_FechaEmiYYYY = new JComboBox<String>();
		comboBox_FechaEmiYYYY.setModel(new DefaultComboBoxModel<String>(new String[] {"YYYY", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_FechaEmiYYYY.setBounds(662, 204, 62, 20);
		getContentPane().add(comboBox_FechaEmiYYYY);
		
		comboBox_FechaEmiDD = new JComboBox<String>();
		comboBox_FechaEmiDD.setModel(new DefaultComboBoxModel<String>(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_FechaEmiDD.setBounds(529, 204, 47, 20);
		getContentPane().add(comboBox_FechaEmiDD);
		
		comboBox_FechaEmiMM = new JComboBox<String>();
		comboBox_FechaEmiMM.setModel(new DefaultComboBoxModel<String>(new String[] {"MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_FechaEmiMM.setBounds(594, 204, 47, 20);
		getContentPane().add(comboBox_FechaEmiMM);
		
		comboBox_FechaVencYYYY = new JComboBox<String>();
		comboBox_FechaVencYYYY.setModel(new DefaultComboBoxModel<String>(new String[] {"YYYY", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_FechaVencYYYY.setBounds(662, 277, 62, 20);
		getContentPane().add(comboBox_FechaVencYYYY);
		
		comboBox_FechaVencDD = new JComboBox<String>();
		comboBox_FechaVencDD.setModel(new DefaultComboBoxModel<String>(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_FechaVencDD.setBounds(529, 277, 47, 20);
		getContentPane().add(comboBox_FechaVencDD);
		
		comboBox_FechaVencMM = new JComboBox<String>();
		comboBox_FechaVencMM.setModel(new DefaultComboBoxModel<String>(new String[] {"MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_FechaVencMM.setBounds(594, 277, 47, 20);
		getContentPane().add(comboBox_FechaVencMM);
		
		textAlianza = new JTextField();
		textAlianza.setEnabled(false);
		textAlianza.setEditable(false);
		textAlianza.setBounds(686, 489, 127, 20);
		getContentPane().add(textAlianza);
		textAlianza.setColumns(10);
		
		textCuit = new JTextField();
		textCuit.setBounds(242, 251, 208, 20);
		getContentPane().add(textCuit);
		textCuit.setColumns(10);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(14, 446, 476, 177);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 308, 476, 139);
		getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(500, 358, 449, 265);
		getContentPane().add(separator_2);
		
		JLabel label_7 = new JLabel("-");
		label_7.setBounds(648, 209, 17, 16);
		getContentPane().add(label_7);
		
		JLabel label_11 = new JLabel("-");
		label_11.setBounds(582, 208, 17, 16);
		getContentPane().add(label_11);
		
		label_13 = new JLabel("-");
		label_13.setBounds(648, 282, 17, 16);
		getContentPane().add(label_13);
		
		label_15 = new JLabel("-");
		label_15.setBounds(582, 281, 17, 16);
		getContentPane().add(label_15);
		
		JLabel lblIngreseLosDatos = new JLabel("Ingrese los datos del Cliente para su alta");
		lblIngreseLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLosDatos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngreseLosDatos.setBounds(96, 33, 805, 55);
		getContentPane().add(lblIngreseLosDatos);
		this.setVisible(true);
	}
	
public Cliente_Datos_Vista(Cliente_Datos_Controller vista, Cliente cliente) {
		
		this.vista = vista;
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
        
		setTitle("Alta de Cliente");
		setBounds(5, 53, 980, 694);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(96, 176, 37, 16);
		getContentPane().add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(324, 176, 62, 16);
		getContentPane().add(lblApellido);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(96, 223, 126, 16);
		getContentPane().add(lblDni);
		
		label_4 = new JLabel("Fecha de Nacimiento");
		label_4.setBounds(24, 276, 126, 16);
		getContentPane().add(label_4);
		
		label_5 = new JLabel("E-mail");
		label_5.setBounds(324, 223, 35, 16);
		getContentPane().add(label_5);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(242, 203, 208, 22);
		getContentPane().add(textEmail);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(14, 154, 208, 22);
		getContentPane().add(textNombre);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(242, 154, 208, 22);
		getContentPane().add(textApellido);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(14, 201, 210, 22);
		getContentPane().add(textDNI);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new CapturaBtnCliente_Datos(this));
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new CapturaBtnCliente_Datos(this));
		btnCancelar.setBounds(822, 602, 97, 25);
		getContentPane().add(btnCancelar);
		btnGuardar.setBounds(698, 601, 97, 25);
		getContentPane().add(btnGuardar);

		label_8 = new JLabel("-");
		label_8.setBounds(133, 250, 17, 16);
		getContentPane().add(label_8);
		
		lblPais = new JLabel("Pais");
		lblPais.setBounds(110, 491, 26, 16);
		getContentPane().add(lblPais);
		
		lblCiudad = new JLabel("Provincia");
		lblCiudad.setBounds(324, 491, 54, 16);
		getContentPane().add(lblCiudad);
		
		lblCiudad_1 = new JLabel("Ciudad");
		lblCiudad_1.setBounds(96, 537, 37, 16);
		getContentPane().add(lblCiudad_1);
		
		textCiudad = new JTextField();
		textCiudad.setColumns(10);
		textCiudad.setBounds(14, 513, 208, 22);
		getContentPane().add(textCiudad);
		
		lblCodigoPostal = new JLabel("Codigo Postal");
		lblCodigoPostal.setBounds(263, 537, 96, 16);
		getContentPane().add(lblCodigoPostal);
		
		textCodPostal = new JTextField();
		textCodPostal.setColumns(10);
		textCodPostal.setBounds(242, 513, 107, 22);
		getContentPane().add(textCodPostal);
		
		lblCalle = new JLabel("Calle");
		lblCalle.setBounds(107, 587, 26, 16);
		getContentPane().add(lblCalle);
		
		textCalle = new JTextField();
		textCalle.setColumns(10);
		textCalle.setBounds(14, 563, 208, 22);
		getContentPane().add(textCalle);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(277, 587, 37, 16);
		getContentPane().add(lblAltura);
		
		textAltura = new JTextField();
		textAltura.setColumns(10);
		textAltura.setBounds(242, 563, 107, 22);
		getContentPane().add(textAltura);
		
		label = new JLabel("-");
		label.setBounds(67, 249, 17, 16);
		getContentPane().add(label);
		
		textTelCelular = new JTextField();
		textTelCelular.setColumns(10);
		textTelCelular.setBounds(242, 330, 208, 22);
		getContentPane().add(textTelCelular);
		
		JLabel lblTelCelular = new JLabel("Tel. Celular");
		lblTelCelular.setBounds(324, 354, 78, 16);
		getContentPane().add(lblTelCelular);
		
		textTelLaboral = new JTextField();
		textTelLaboral.setColumns(10);
		textTelLaboral.setBounds(14, 383, 208, 22);
		getContentPane().add(textTelLaboral);
		
		JLabel lblTelLaboral = new JLabel("Tel. Laboral");
		lblTelLaboral.setBounds(71, 407, 97, 16);
		getContentPane().add(lblTelLaboral);
		
		textTelPersonal = new JTextField();
		textTelPersonal.setColumns(10);
		textTelPersonal.setBounds(14, 330, 208, 22);
		getContentPane().add(textTelPersonal);
		
		JLabel lblTelPersonal = new JLabel("Tel. Personal");
		lblTelPersonal.setBounds(71, 354, 97, 16);
		getContentPane().add(lblTelPersonal);
		
		JLabel label_1 = new JLabel("Numero de Pasaporte");
		label_1.setBounds(560, 176, 126, 16);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Autoridad de Emision");
		label_2.setBounds(793, 176, 126, 16);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Fecha de Emision");
		label_3.setBounds(526, 233, 126, 16);
		getContentPane().add(label_3);
		
		JLabel label_6 = new JLabel("Pais de Emision");
		label_6.setBounds(805, 226, 114, 16);
		getContentPane().add(label_6);
		
		textNroPasaporte = new JTextField();
		textNroPasaporte.setColumns(10);
		textNroPasaporte.setBounds(526, 154, 198, 22);
		getContentPane().add(textNroPasaporte);
		
		textAutoridadEmision = new JTextField();
		textAutoridadEmision.setColumns(10);
		textAutoridadEmision.setBounds(743, 154, 199, 22);
		getContentPane().add(textAutoridadEmision);
		
		JLabel label_9 = new JLabel("Aerolinea");
		label_9.setBounds(607, 446, 72, 16);
		getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Alianza");
		label_10.setBounds(607, 491, 45, 16);
		getContentPane().add(label_10);
		
		JLabel lblNumeroPasajero = new JLabel("Numero Pasajero");
		lblNumeroPasajero.setBounds(586, 407, 126, 16);
		getContentPane().add(lblNumeroPasajero);
		
		textNroPasajero = new JTextField();
		textNroPasajero.setColumns(10);
		textNroPasajero.setBounds(526, 386, 198, 22);
		getContentPane().add(textNroPasajero);
		
		JLabel label_12 = new JLabel("Categoria");
		label_12.setBounds(816, 407, 85, 16);
		getContentPane().add(label_12);
		
		textCategoria = new JTextField();
		textCategoria.setColumns(10);
		textCategoria.setBounds(743, 386, 199, 22);
		getContentPane().add(textCategoria);
		
		JLabel label_14 = new JLabel("Fecha de Vencimiento");
		label_14.setBounds(526, 308, 126, 16);
		getContentPane().add(label_14);
		
		lblPasajeroFrecuente = new JLabel("Pasajero Frecuente");
		lblPasajeroFrecuente.setBounds(516, 358, 221, 17);
		getContentPane().add(lblPasajeroFrecuente);
		
		lblPasaporte = new JLabel("Pasaporte");
		lblPasaporte.setBounds(526, 123, 138, 16);
		getContentPane().add(lblPasaporte);
		
		lblDatosBasicos = new JLabel("Datos Basicos");
		lblDatosBasicos.setBounds(14, 123, 221, 16);
		getContentPane().add(lblDatosBasicos);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(14, 308, 221, 16);
		getContentPane().add(lblTelefono);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(14, 446, 221, 16);
		getContentPane().add(lblDireccion);
		
		JLabel lblCuitcuil = new JLabel("CUIT/CUIL");
		lblCuitcuil.setBounds(306, 277, 72, 14);
		getContentPane().add(lblCuitcuil);
		
		comboBox_Pais = new JComboBox<Pais>();
		comboBox_Pais.setBounds(14, 468, 208, 20);
		comboBox_Pais.setModel(new DefaultComboBoxModel<Pais>(vista.obtenerListaPaises()));
		getContentPane().add(comboBox_Pais);
		
		comboBox_Provincia = new JComboBox<Provincia>();
		comboBox_Provincia.setBounds(242, 468, 208, 20);
		comboBox_Provincia.setModel(new DefaultComboBoxModel<Provincia>(vista.obtenerListaProvincias()));
		getContentPane().add(comboBox_Provincia);
		
		comboBox_PaisEmision = new JComboBox<Pais>();
		comboBox_PaisEmision.setModel(new DefaultComboBoxModel<Pais>(vista.obtenerListaPaises()));
		comboBox_PaisEmision.setBounds(743, 204, 199, 20);
		getContentPane().add(comboBox_PaisEmision);
		
		JLabel lbl_Alianza = new JLabel("");
		lbl_Alianza.setBounds(691, 492, 122, 14);
		getContentPane().add(lbl_Alianza);
		
		comboBox_Aerolinea = new JComboBox<LineaAerea>();
		comboBox_Aerolinea.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Integer seleccion=((LineaAerea)comboBox_Aerolinea.getSelectedItem()).getAlianza();
				if(seleccion==1) {
					lbl_Alianza.setText("Skyteam");
				}else if (seleccion==2) {
					lbl_Alianza.setText("Oneworld");
				}else if (seleccion==3) {
					lbl_Alianza.setText("Star Alliance");
				}else {
					lbl_Alianza.setText("");
				}
			}
		});
		comboBox_Aerolinea.setModel(new DefaultComboBoxModel<LineaAerea>(vista.obtenerListaAerolinea()));
		comboBox_Aerolinea.setBounds(686, 446, 233, 22);
		getContentPane().add(comboBox_Aerolinea);
		
		comboBox_FechaNacYYYY = new JComboBox<String>();
		comboBox_FechaNacYYYY.setModel(new DefaultComboBoxModel<String>(new String[] {"YYYY", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_FechaNacYYYY.setBounds(147, 245, 62, 20);
		getContentPane().add(comboBox_FechaNacYYYY);
		
		comboBox_FechaNacDD = new JComboBox<String>();
		comboBox_FechaNacDD.setModel(new DefaultComboBoxModel<String>(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_FechaNacDD.setBounds(14, 245, 47, 20);
		getContentPane().add(comboBox_FechaNacDD);
		
		comboBox_FechaNacMM = new JComboBox<String>();
		comboBox_FechaNacMM.setModel(new DefaultComboBoxModel<String>(new String[] {"MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_FechaNacMM.setBounds(79, 245, 47, 20);
		getContentPane().add(comboBox_FechaNacMM);
		
		comboBox_FechaEmiYYYY = new JComboBox<String>();
		comboBox_FechaEmiYYYY.setModel(new DefaultComboBoxModel<String>(new String[] {"YYYY", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_FechaEmiYYYY.setBounds(662, 204, 62, 20);
		getContentPane().add(comboBox_FechaEmiYYYY);
		
		comboBox_FechaEmiDD = new JComboBox<String>();
		comboBox_FechaEmiDD.setModel(new DefaultComboBoxModel<String>(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_FechaEmiDD.setBounds(529, 204, 47, 20);
		getContentPane().add(comboBox_FechaEmiDD);
		
		comboBox_FechaEmiMM = new JComboBox<String>();
		comboBox_FechaEmiMM.setModel(new DefaultComboBoxModel<String>(new String[] {"MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_FechaEmiMM.setBounds(594, 204, 47, 20);
		getContentPane().add(comboBox_FechaEmiMM);
		
		comboBox_FechaVencYYYY = new JComboBox<String>();
		comboBox_FechaVencYYYY.setModel(new DefaultComboBoxModel<String>(new String[] {"YYYY", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
		comboBox_FechaVencYYYY.setBounds(662, 277, 62, 20);
		getContentPane().add(comboBox_FechaVencYYYY);
		
		comboBox_FechaVencDD = new JComboBox<String>();
		comboBox_FechaVencDD.setModel(new DefaultComboBoxModel<String>(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_FechaVencDD.setBounds(529, 277, 47, 20);
		getContentPane().add(comboBox_FechaVencDD);
		
		comboBox_FechaVencMM = new JComboBox<String>();
		comboBox_FechaVencMM.setModel(new DefaultComboBoxModel<String>(new String[] {"MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_FechaVencMM.setBounds(594, 277, 47, 20);
		getContentPane().add(comboBox_FechaVencMM);
		
		textAlianza = new JTextField();
		textAlianza.setEnabled(false);
		textAlianza.setEditable(false);
		textAlianza.setBounds(686, 489, 127, 20);
		getContentPane().add(textAlianza);
		textAlianza.setColumns(10);
		
		textCuit = new JTextField();
		textCuit.setBounds(242, 251, 208, 20);
		getContentPane().add(textCuit);
		textCuit.setColumns(10);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(14, 446, 476, 177);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 308, 476, 139);
		getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(500, 358, 449, 265);
		getContentPane().add(separator_2);
		
		JLabel label_7 = new JLabel("-");
		label_7.setBounds(648, 209, 17, 16);
		getContentPane().add(label_7);
		
		JLabel label_11 = new JLabel("-");
		label_11.setBounds(582, 208, 17, 16);
		getContentPane().add(label_11);
		
		label_13 = new JLabel("-");
		label_13.setBounds(648, 282, 17, 16);
		getContentPane().add(label_13);
		
		label_15 = new JLabel("-");
		label_15.setBounds(582, 281, 17, 16);
		getContentPane().add(label_15);
		
		JLabel lblIngreseLosDatos = new JLabel("Ingrese los datos del Cliente para su alta");
		lblIngreseLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLosDatos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngreseLosDatos.setBounds(96, 33, 805, 55);
		getContentPane().add(lblIngreseLosDatos);
		this.setVisible(true);
	}

	
	public Cliente_Datos_Controller getController() {
		return vista;
	}



	public void setController(Cliente_Datos_Controller vista) {
		this.vista = vista;
	}



	public JButton getBtnCancelar() {
		return btnCancelar;
	}



	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}



	public JTextField getTextEmail() {
		return textEmail;
	}



	public void setTextEmail(JTextField textEmail) {
		this.textEmail = textEmail;
	}



	public JTextField getTextNombre() {
		return textNombre;
	}



	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}



	public JTextField getTextApellido() {
		return textApellido;
	}



	public void setTextApellido(JTextField textApellido) {
		this.textApellido = textApellido;
	}



	public JTextField getTextDNI() {
		return textDNI;
	}



	public void setTextDNI(JTextField textDNI) {
		this.textDNI = textDNI;
	}



	public JButton getBtnGuardar() {
		return btnGuardar;
	}



	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}



	public JTextField getTextCiudad() {
		return textCiudad;
	}



	public void setTextCiudad(JTextField textCiudad) {
		this.textCiudad = textCiudad;
	}



	public JTextField getTextCodPostal() {
		return textCodPostal;
	}



	public void setTextCodPostal(JTextField textCodPostal) {
		this.textCodPostal = textCodPostal;
	}



	public JTextField getTextCalle() {
		return textCalle;
	}



	public void setTextCalle(JTextField textCalle) {
		this.textCalle = textCalle;
	}



	public JTextField getTextAltura() {
		return textAltura;
	}



	public void setTextAltura(JTextField textAltura) {
		this.textAltura = textAltura;
	}



	public JTextField getTextTelCelular() {
		return textTelCelular;
	}



	public void setTextTelCelular(JTextField textTelCelular) {
		this.textTelCelular = textTelCelular;
	}



	public JTextField getTextTelLaboral() {
		return textTelLaboral;
	}



	public void setTextTelLaboral(JTextField textTelLaboral) {
		this.textTelLaboral = textTelLaboral;
	}



	public JTextField getTextTelPersonal() {
		return textTelPersonal;
	}



	public void setTextTelPersonal(JTextField textTelPersonal) {
		this.textTelPersonal = textTelPersonal;
	}



	public JTextField getTextNroPasaporte() {
		return textNroPasaporte;
	}



	public void setTextNroPasaporte(JTextField textNroPasaporte) {
		this.textNroPasaporte = textNroPasaporte;
	}



	public JTextField getTextAutoridadEmision() {
		return textAutoridadEmision;
	}



	public void setTextAutoridadEmision(JTextField textAutoridadEmision) {
		this.textAutoridadEmision = textAutoridadEmision;
	}



	public JTextField getTextNroPasajero() {
		return textNroPasajero;
	}



	public void setTextNroPasajero(JTextField textNroPasajero) {
		this.textNroPasajero = textNroPasajero;
	}



	public JTextField getTextCategoria() {
		return textCategoria;
	}



	public void setTextCategoria(JTextField textCategoria) {
		this.textCategoria = textCategoria;
	}



	public JTextField getTextCuit() {
		return textCuit;
	}



	public void setTextCuit(JTextField textCuit) {
		this.textCuit = textCuit;
	}



	public JComboBox<Pais> getComboBox_Pais() {
		return comboBox_Pais;
	}



	public void setComboBox_Pais(JComboBox<Pais> comboBox_Pais) {
		this.comboBox_Pais = comboBox_Pais;
	}



	public JComboBox<Provincia> getComboBox_Provincia() {
		return comboBox_Provincia;
	}



	public void setComboBox_Provincia(JComboBox<Provincia> comboBox_Provincia) {
		this.comboBox_Provincia = comboBox_Provincia;
	}



	public JComboBox<Pais> getComboBox_PaisEmision() {
		return comboBox_PaisEmision;
	}



	public void setComboBox_PaisEmision(JComboBox<Pais> comboBox_PaisEmision) {
		this.comboBox_PaisEmision = comboBox_PaisEmision;
	}



	public JComboBox<LineaAerea> getComboBox_Aerolinea() {
		return comboBox_Aerolinea;
	}



	public void setComboBox_Aerolinea(JComboBox<LineaAerea> comboBox_Aerolinea) {
		this.comboBox_Aerolinea = comboBox_Aerolinea;
	}



	public JComboBox<String> getComboBox_FechaVencYYYY() {
		return comboBox_FechaVencYYYY;
	}



	public void setComboBox_FechaVencYYYY(JComboBox<String> comboBox_FechaVencYYYY) {
		this.comboBox_FechaVencYYYY = comboBox_FechaVencYYYY;
	}



	public JComboBox<String> getComboBox_FechaVencDD() {
		return comboBox_FechaVencDD;
	}



	public void setComboBox_FechaVencDD(JComboBox<String> comboBox_FechaVencDD) {
		this.comboBox_FechaVencDD = comboBox_FechaVencDD;
	}



	public JComboBox<String> getComboBox_FechaVencMM() {
		return comboBox_FechaVencMM;
	}



	public void setComboBox_FechaVencMM(JComboBox<String> comboBox_FechaVencMM) {
		this.comboBox_FechaVencMM = comboBox_FechaVencMM;
	}



	public JComboBox<String> getComboBox_FechaNacDD() {
		return comboBox_FechaNacDD;
	}



	public void setComboBox_FechaNacDD(JComboBox<String> comboBox_FechaNacDD) {
		this.comboBox_FechaNacDD = comboBox_FechaNacDD;
	}



	public JComboBox<String> getComboBox_FechaNacYYYY() {
		return comboBox_FechaNacYYYY;
	}



	public void setComboBox_FechaNacYYYY(JComboBox<String> comboBox_FechaNacYYYY) {
		this.comboBox_FechaNacYYYY = comboBox_FechaNacYYYY;
	}



	public JComboBox<String> getComboBox_FechaNacMM() {
		return comboBox_FechaNacMM;
	}



	public void setComboBox_FechaNacMM(JComboBox<String> comboBox_FechaNacMM) {
		this.comboBox_FechaNacMM = comboBox_FechaNacMM;
	}



	public JComboBox<String> getComboBox_FechaEmiMM() {
		return comboBox_FechaEmiMM;
	}



	public void setComboBox_FechaEmiMM(JComboBox<String> comboBox_FechaEmiMM) {
		this.comboBox_FechaEmiMM = comboBox_FechaEmiMM;
	}



	public JComboBox<String> getComboBox_FechaEmiDD() {
		return comboBox_FechaEmiDD;
	}



	public void setComboBox_FechaEmiDD(JComboBox<String> comboBox_FechaEmiDD) {
		this.comboBox_FechaEmiDD = comboBox_FechaEmiDD;
	}



	public JComboBox<String> getComboBox_FechaEmiYYYY() {
		return comboBox_FechaEmiYYYY;
	}



	public void setComboBox_FechaEmiYYYY(JComboBox<String> comboBox_FechaEmiYYYY) {
		this.comboBox_FechaEmiYYYY = comboBox_FechaEmiYYYY;
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
