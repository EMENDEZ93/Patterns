package Inter.impl;

import Inter.IConexion;

public class ConexionSQLServer implements IConexion {


	private String host;
	private String port;
	private String user;
	private String password;

	public ConexionSQLServer() {
		this.host = "localhost";
		this.port = "3309";
		this.user = "root";
		this.password = "12345";		
	}

	@Override
	public void conectar() {
		System.out.println("Connected to SQLServer");
	}

	@Override
	public void desconectar() {
		System.out.println("Unconnected to SQLServer");		
	}
	
	@Override
	public String toString() {
		return "SQLServer [host=" + host + ","
				+ " port=" + port + ", user=" + user + ", password="
				+ password + "]";
	}
		
}
