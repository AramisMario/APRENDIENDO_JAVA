package entryPoint;
import clases.CuentaAHImpl;
public class EntryPoint {
	public static void main(String args[]) {
		CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
		cuentaAhorro.setMonto(200);
		CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();
		if(cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}
		System.out.println(cuentaClonada == cuentaAhorro);
	}
}
