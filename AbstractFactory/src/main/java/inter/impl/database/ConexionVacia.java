package inter.impl.database;

import inter.IConexionDB;

public class ConexionVacia implements IConexionDB {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR"); 
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}

}
