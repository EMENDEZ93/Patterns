package inter.impl.rest;

import inter.IConexionRest;

public class ConexionRestNoArea implements IConexionRest {

	@Override
	public void leeURL(String url) {
		System.out.println("Area no elegida");
	}

}
