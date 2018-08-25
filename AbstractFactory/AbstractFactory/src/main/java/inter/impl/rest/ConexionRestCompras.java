package inter.impl.rest;

import inter.IConexionRest;

public class ConexionRestCompras implements IConexionRest {

	@Override
	public void leeURL(String url) {
		System.out.println("Conectándose a " + url);
	}

}
