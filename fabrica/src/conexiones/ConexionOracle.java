package conexiones;
import interfaces.IConexion;
public class ConexionOracle implements IConexion{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public ConexionOracle() {
		
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contraseña = "123";
	}
	
	@Override
	public void conectar(){
		System.out.println("Se conecto a Oracle");
	}
	@Override
	public void desconectar() {
		System.out.println("Se desconecto de Oracle");
	}
	
}
