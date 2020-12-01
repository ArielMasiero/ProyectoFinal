package dao.interfaces;

import java.io.IOException;
import java.util.Hashtable;

public interface AlianzaInterface {
	public Hashtable<Integer, String> leerAlianzas() throws IOException;
}
