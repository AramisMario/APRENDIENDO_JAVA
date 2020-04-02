package interfaces;

public interface FabricaAbstracta {
	IConexionBD getDB(String motor);
	IConexionREST getREST(String area);
}
