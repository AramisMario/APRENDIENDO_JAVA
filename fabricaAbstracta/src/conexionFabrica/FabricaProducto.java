package conexionFabrica;
import interfaces.FabricaAbstracta;
public class FabricaProducto {
	public static FabricaAbstracta getFactory(String factory) {
		if(factory.equalsIgnoreCase("BD")) {
			return new ConexionBDFabrica();
		}else if(factory.equalsIgnoreCase("REST")) {
			return new ConexionRESTFabrica();
		}
		return null;
	}
}
