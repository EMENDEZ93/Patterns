import inter.FabricaAbstracta;
import inter.IConexionDB;
import inter.IConexionRest;
import inter.impl.database.ConexionMySQL;
import inter.impl.database.ConexionOracle;
import inter.impl.database.ConexionPostgreSQL;
import inter.impl.database.ConexionVacia;

public class ConexionBDFabrica implements FabricaAbstracta {

	@Override
	public IConexionDB getDB(String motor) {

		switch (motor) {
		case "MYSQL":
			return new ConexionMySQL();
		case "ORACLE":
			return new ConexionOracle();
		case "POSTGRESS":
			return new ConexionPostgreSQL();
		default:
			return new ConexionVacia();
		}

	}

	@Override
	public IConexionRest getRest(String area) {
		return null;
	}

}
