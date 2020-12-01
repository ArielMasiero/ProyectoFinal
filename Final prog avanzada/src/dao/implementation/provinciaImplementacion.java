package dao.implementation;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

import dao.interfaces.ProvinciasInterface;
import dao.utils.PropertiesUtil;

public class provinciaImplementacion implements ProvinciasInterface{
	private File file;
	private Scanner scanner;
	@Override
	public Hashtable<Integer, String> leerProvincias() throws IOException {
		file = new File(PropertiesUtil.getPathTxt(), PropertiesUtil.getNameProvincias());
		scanner= new Scanner(file);
		Hashtable<Integer, String> list = new Hashtable<Integer, String>();
		while (scanner.hasNextLine()){
			String[] straux = scanner.nextLine().split("-");		
			list.put(Integer.valueOf(straux[0]), straux[1]);
		}
		return list;
	}

}
