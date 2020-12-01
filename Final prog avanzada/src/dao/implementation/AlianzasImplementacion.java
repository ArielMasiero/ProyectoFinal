package dao.implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

import dao.interfaces.AlianzaInterface;
import dao.utils.PropertiesUtil;

public class AlianzasImplementacion implements AlianzaInterface{
	private File file;
	private Scanner scanner;
	
	@Override
	public Hashtable<Integer, String> leerAlianzas() throws IOException {
		try {
			file = new File(PropertiesUtil.getPathTxt(), PropertiesUtil.getNameAlianzas());
			scanner= new Scanner(file);
			Hashtable<Integer, String> list = new Hashtable<Integer, String>();
			while (scanner.hasNextLine()){
				String[] straux = scanner.nextLine().split("-");		
				list.put(Integer.valueOf(straux[0]), straux[1]);
			}
			return list;
		}catch(FileNotFoundException e) {
			
		}
			return null;
	}
}
