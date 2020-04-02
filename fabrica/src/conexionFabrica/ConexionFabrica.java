package conexionFabrica;
import interfaces.IConexion;
import conexiones .*;

public class ConexionFabrica {
	
	public IConexion getConexion(String motor) {
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
}
