package Inter.impl;

import Inter.IConexion;

public class ConexionMySQL implements IConexion {

	private String host;
	private String port;
	private String user;
	private String password;

	public ConexionMySQL() {
		this.host = "localhost";
		this.port = "3306";
		this.user = "root";
		this.password = "12345";		
	}

	@Override
	public void conectar() {
		System.out.println("Connected to MySQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Unconnected to MySQL");		
	}
	
	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ","
				+ " port=" + port + ", user=" + user + ", password="
				+ password + "]";
	}
}
