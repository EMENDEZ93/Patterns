import Inter.IConexion;
import Inter.impl.ConexionMySQL;
import Inter.impl.ConexionOracle;
import Inter.impl.ConexionPostgreSQL;
import Inter.impl.ConexionSQLServer;
import Inter.impl.ConexionVacia;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {

		switch (motor) {

		case "MYSQL":
			return new ConexionMySQL();
		case "ORACLE":
			return new ConexionOracle();
		case "POSTGRESS":
			return new ConexionPostgreSQL();
		case "SQL":
			return new ConexionSQLServer();
		default:
			return new ConexionVacia();
		}

	}

}
