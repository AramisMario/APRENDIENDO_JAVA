package conexiones;
import interfaces.IConexionBD;

public class ConexionPostgreSQL implements IConexionBD{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public ConexionPostgreSQL(){
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgre";
		this.contraseña = "123";
	}
	
	@Override
	public void conectar() {
		System.out.println("Se conecto a PostgreSQL");
	}
	@Override
	public void desconectar() {
		System.out.println("Se desconecto de PostgreSQL");
	}
}