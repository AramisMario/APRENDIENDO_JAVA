package entryPoint;
import decoradores.BlindajeDecorador;
import model.Cuenta;
import interfaces.ICuentaBancaria;
import implementaciones.*;
public class Main {
	public static void main(String args[]) {
		Cuenta c = new Cuenta(1,"Usuario1");
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		cuentaBlindada.abrirCuenta(c);
	}
}
