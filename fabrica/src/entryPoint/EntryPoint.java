package entryPoint;
import conexionFabrica.ConexionFabrica;
import interfaces.IConexion;
public class EntryPoint {
	public static void main(String args[]) {
		ConexionFabrica fabrica = new ConexionFabrica();
		
		IConexion cx1 = fabrica.getConexion("mysql");
		cx1.conectar();
		cx1.desconectar();
		IConexion cx2 = fabrica.getConexion("ORACLE");
		cx2.conectar();
		cx2.desconectar();
		IConexion cx3 = fabrica.getConexion("h4");
		cx3.conectar();
		cx3.desconectar();
	}
}
