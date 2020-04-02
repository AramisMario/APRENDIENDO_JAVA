package entryPoint;
import interfaces.FabricaAbstracta;
import interfaces.IConexionBD;
import conexionFabrica.FabricaProducto; 
public class EntryPoint {
	public static void main(String args[]) {
		FabricaAbstracta fabricaBD = FabricaProducto.getFactory("BD");
		IConexionBD  cx1 = fabricaBD.getDB("MYSQL");
		cx1.conectar();
	}
}
