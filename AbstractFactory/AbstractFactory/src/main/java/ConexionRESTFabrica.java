import inter.FabricaAbstracta;
import inter.IConexionDB;
import inter.IConexionRest;
import inter.impl.rest.ConexionRestCompras;
import inter.impl.rest.ConexionRestNoArea;
import inter.impl.rest.ConexionRestVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionRest getRest(String area) {

		switch (area) {
		case "VENTAS":
			return new ConexionRestVentas();
		case "COMPRAS":
			return new ConexionRestCompras();
		default:
			return new ConexionRestNoArea();
		}

	}

	@Override
	public IConexionDB getDB(String motor) {
		return null;
	}

}
