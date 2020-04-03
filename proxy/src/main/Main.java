package main;
import interfaces.ICuenta;
import model.Cuenta;
import proxy.Proxy;
public class Main {
	public static void main(String args[]) {
		
		Cuenta c = new Cuenta(1, "aramis", 100);
		
		ICuenta cuenta = new Proxy();
		cuenta.mostrarSaldo(c);
		c = cuenta.depositarDinero(c, 50);
		c = cuenta.retirarDinero(c, 20);
		cuenta.mostrarSaldo(c);
	}
}
