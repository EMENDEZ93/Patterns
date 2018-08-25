package Inter.impl;

import Inter.IConexion;

public class ConexionOracle implements IConexion {

	private String host;
	private String port;
	private String user;
	private String password;

	public ConexionOracle() {
		this.host = "localhost";
		this.port = "3307";
		this.user = "root";
		this.password = "12345";		
	}

	@Override
	public void conectar() {
		System.out.println("Connected to Oracle");
	}

	@Override
	public void desconectar() {
		System.out.println("Unconnected to Oracle");		
	}
	
	@Override
	public String toString() {
		return "ConexionOracleL [host=" + host + ","
				+ " port=" + port + ", user=" + user + ", password="
				+ password + "]";
	}	
	
}
