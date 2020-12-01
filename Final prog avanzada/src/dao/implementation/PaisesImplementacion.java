package dao.implementation;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

import dao.interfaces.PaisesInterfaces;
import dao.utils.PropertiesUtil;

public class PaisesImplementacion implements PaisesInterfaces{
	private File file;
	private Scanner scanner;
	@Override
	public Hashtable<Integer, String> leerPaises() throws IOException {
		file = new File(PropertiesUtil.getPathTxt(), PropertiesUtil.getNamePaises());
		scanner= new Scanner(file);
		Hashtable<Integer, String> list = new Hashtable<Integer, String>();
		while (scanner.hasNextLine()){
			String[] straux = scanner.nextLine().split("-");		
			list.put(Integer.valueOf(straux[0]), straux[1]);
		}
		return list;
	}

}
