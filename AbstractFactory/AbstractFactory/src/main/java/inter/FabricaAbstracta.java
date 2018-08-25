package inter;

public interface FabricaAbstracta {

	IConexionDB getDB(String motor);
	IConexionRest getRest(String area);

}
