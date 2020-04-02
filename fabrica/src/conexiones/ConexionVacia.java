package conexiones;
import interfaces.IConexion;

public class ConexionVacia implements IConexion {
	
	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICO PROVEEDOR");
	}
	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICO PROVEEDOR");
	}

}
