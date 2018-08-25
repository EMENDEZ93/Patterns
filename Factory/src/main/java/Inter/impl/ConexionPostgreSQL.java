package Inter.impl;

import Inter.IConexion;

public class ConexionPostgreSQL implements IConexion {

	private String host;
	private String port;
	private String user;
	private String password;

	public ConexionPostgreSQL() {
		this.host = "localhost";
		this.port = "3308";
		this.user = "root";
		this.password = "12345";		
	}

	@Override
	public void conectar() {
		System.out.println("Connected to PostgreSQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Unconnected to PostgreSQL");		
	}
	
	@Override
	public String toString() {
		return "ConexionPostgreSQL [host=" + host + ","
				+ " port=" + port + ", user=" + user + ", password="
				+ password + "]";
	}		
	
}
