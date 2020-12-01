package dao.interfaces;

import java.io.IOException;
import java.util.Hashtable;

public interface ProvinciasInterface {
	public Hashtable<Integer, String> leerProvincias() throws IOException;
}
