package inter.impl.rest;

import inter.IConexionRest;

public class ConexionRestVentas implements IConexionRest {

	@Override
	public void leeURL(String url) {
		System.out.println("Browser " + url);
	}

}
