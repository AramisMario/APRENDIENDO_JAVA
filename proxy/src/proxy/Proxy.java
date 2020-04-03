package proxy;
import interfaces.ICuenta;
import implementaciones.CuentaBancoAImpl;
import model.Cuenta;
public class Proxy implements ICuenta {
	
	private CuentaBancoAImpl cuentaReal;
	
	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		if(cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.retirarDinero(cuenta, monto);
		}else {
			return cuentaReal.retirarDinero(cuenta, monto);
		}
	}
	
	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		if(cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.depositarDinero(cuenta, monto);
		}else {
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}
	
	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		if(cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
			cuentaReal.mostrarSaldo(cuenta);
		}else {
			cuentaReal.mostrarSaldo(cuenta);
		}
	}
}
