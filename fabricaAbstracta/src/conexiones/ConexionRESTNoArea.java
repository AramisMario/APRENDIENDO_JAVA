package conexiones;
import interfaces.IConexionREST;
public class ConexionRESTNoArea implements IConexionREST{
	
	@Override
	public void leerURL(String url) {
		System.out.println("AREA NO ELEGIDA");
	}
}
