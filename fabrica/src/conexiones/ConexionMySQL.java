package conexiones;
import interfaces.IConexion;;
public class ConexionMySQL implements IConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public ConexionMySQL(){
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contraseña = "123";
	}
	
	@Override
	public void conectar() {
		System.out.println("Se conecto a MySQL");
	}
	
	@Override
	public void desconectar() {
		System.out.println("Se desconecto de MySQL");
	}
	
}
