package dao.utils;

import java.util.Properties;



import java.io.*;

public class PropertiesUtil 
{
	private static Properties config;
	private static String properties = "config.properties";
	
	public static String getConSQL() {
		config = new Properties();
		//ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		//InputStream propertiesStream = classLoader.getResourceAsStream(properties);
		return ("jdbc:sqlserver://"+PropertiesUtil.getIP()+":"+
		PropertiesUtil.getPort()+";databaseName="+PropertiesUtil.getDBName());
		//return ("jdbc:sqlserver://"+PropertiesUtil.getIP()+":"+PropertiesUtil.getHost()+
		//";databaseName="+PropertiesUtil.getDBName());
}
	
	public static String getDriver() {
		try {
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream(properties));
			return config.getProperty("Driver");
		} catch (IOException e) {
			IOGeneral.pritln("Error al leer el properties (Obtener Driver)\nMensaje: "+e.getMessage());
		}
		return null;
	}
	public static String getDBName() {
		try{
			config = new Properties();
			//ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			//InputStream propertiesStream = classLoader.getResourceAsStream(properties);
			config.load(ClassLoader.getSystemResourceAsStream(properties));
			return config.getProperty("DBName");
			//return "Todo";
		}catch (IOException e) {
			IOGeneral.pritln("Error al leer el properties (Obtener nombre de Base de Datos)\nMensaje: "+e.getMessage());
		}
		return null;
		
}
	public static String getIP() {
		try {
			config = new Properties();
			//ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			//InputStream propertiesStream = classLoader.getResourceAsStream(properties);
			config.load(ClassLoader.getSystemResourceAsStream(properties));
			return config.getProperty("IP");
		}catch (IOException e) {
				IOGeneral.pritln("Error al leer el properties (Obtener IP de Base de Datos)\nMensaje: "+e.getMessage());
		}
		return null;
		//return "127.0.0.1";
	}
	public static String getPort() {
		try{
			config = new Properties();
			//ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			//InputStream propertiesStream = classLoader.getResourceAsStream(properties);
			config.load(ClassLoader.getSystemResourceAsStream(properties));
			return config.getProperty("PORT");
		}catch (IOException e) {
			IOGeneral.pritln("Error al leer el properties (Obtener Host de Base de Datos)\nMensaje: "+e.getMessage());
		}
		return null;
		//return "49170";
	}
	public static String getUser() {
		try {
			config = new Properties();
			//ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			//InputStream propertiesStream = classLoader.getResourceAsStream(properties);
			config.load(ClassLoader.getSystemResourceAsStream(properties));
			return config.getProperty("User");
			//return "sa";
		}catch (IOException e) {
			IOGeneral.pritln("Error al leer el properties (Obtener Usuario de Base de Datos)\nMensaje: "+e.getMessage());
	}
	return null;
			
	}
	public static String getPassword() {
		try {
			config = new Properties();
			//ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			//InputStream propertiesStream = classLoader.getResourceAsStream(properties);
			config.load(ClassLoader.getSystemResourceAsStream(properties));
			return config.getProperty("Password");
			//return "modosabio4";
		}catch (IOException e) {
		IOGeneral.pritln("Error al leer el properties (Obtener Contrasenia de Base de Datos)\nMensaje: "+e.getMessage());
		}	
		return null;
	}
	
	
	
	public static String getNameAlianzas()throws IOException, FileNotFoundException
	{
		try{
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream("config.properties"));
			return config.getProperty("nameFileAlianzas");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}

	
	public static String getPathTxt()throws IOException, FileNotFoundException
	{
		try{
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream("config.properties"));
			return config.getProperty("pathtxt");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}

	public static String getNameProvincias() {
		try{
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream("config.properties"));
			return config.getProperty("nameFileProvincias");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}

	public static String getNamePaises() {
		try{
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream("config.properties"));
			return config.getProperty("nameFilePaises");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	
}
