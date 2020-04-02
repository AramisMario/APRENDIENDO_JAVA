package conexionFabrica;
import interfaces.FabricaAbstracta;
import interfaces.IConexionREST;
import interfaces.IConexionBD;
import conexiones.*;
public class ConexionRESTFabrica implements FabricaAbstracta{
	
	@Override
	public IConexionREST getREST(String area) {
		if(area == null) {
			return new ConexionRESTNoArea();
		}else if(area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		}else if(area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}
		return new ConexionRESTNoArea();
	}
	@Override 
	public IConexionBD getDB(String motor) {
		return null;
	}
}
