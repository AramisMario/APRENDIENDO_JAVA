package conexiones;
import interfaces.IConexionREST;
public class ConexionRESTCompras implements IConexionREST{
	
	@Override
	public void leerURL(String url) {
		System.out.println("Conectandose a "+url);
	}
}
