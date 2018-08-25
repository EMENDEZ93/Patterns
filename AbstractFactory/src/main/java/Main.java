import inter.FabricaAbstracta;
import inter.IConexionDB;
import inter.IConexionRest;

public class Main {

	public static void main(String[] args) {

		FabricaAbstracta fabricaDB = FabricaProductor.getFactory("BD");
		IConexionDB conexionDB = fabricaDB.getDB("MYSQL");
		
		conexionDB.conectar();
		
		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionRest conexionRest = fabricaREST.getRest("COMPRAS");
		
		conexionRest.leeURL("https://www.google.com");
	}

}
