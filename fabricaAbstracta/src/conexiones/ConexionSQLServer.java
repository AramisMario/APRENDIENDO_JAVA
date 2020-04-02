package conexiones;
import interfaces.IConexionBD;

public class ConexionSQLServer implements IConexionBD {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public ConexionSQLServer() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "sqlserver";
		this.contraseña = "123";
	}
	
	@Override
	public void conectar() {
		System.out.println("Se conecto a SQLServer");
	}
	
	@Override
	public void desconectar() {
		System.out.println("Se desconecto de SQLServer");
	}

}