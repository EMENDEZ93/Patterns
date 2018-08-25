import Inter.IConexion;

public class Main {

	public static void main(String[] args) {

		ConexionFabrica fabrica = new ConexionFabrica();

		
		System.out.println("********************************");		
		System.out.println("*********    Fabrica     *******");		
		System.out.println("********************************");		
		
		IConexion conexion1 = fabrica.getConexion("ORACLE"); 
		conexion1.conectar();
		conexion1.desconectar();

		IConexion conexion2 = fabrica.getConexion("ORACLE"); 
		conexion2.conectar();
		conexion2.desconectar();
		
		IConexion conexion3 = fabrica.getConexion("H2"); 
		conexion3.conectar();
		conexion3.desconectar();
		
		System.out.println("********************************");		
	}

}
