package conexionFabrica;
import interfaces.IConexionBD;
import interfaces.IConexionREST;
import interfaces.FabricaAbstracta;
import conexiones.*;
public class ConexionBDFabrica implements FabricaAbstracta{
	
	@Override
	public IConexionBD getDB(String motor) {
		if(motor == null) {
			return new ConexionVacia();
		}
		if(motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		}else if(motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		}else if(motor.equalsIgnoreCase("SQLSERVER")) {
			return new ConexionSQLServer();
		}else if(motor.equalsIgnoreCase("POSTGRESQL")){
			return new ConexionPostgreSQL();
		}
		return new ConexionVacia();
	}
	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}