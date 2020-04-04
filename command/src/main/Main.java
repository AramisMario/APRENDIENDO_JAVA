package main;
import commands.Cuenta;
import commands.DepositarImpl;
import commands.Invoker;
import commands.RetirarImpl;
public class Main {
	public static void main(String args[]) {
		
		Cuenta cuenta = new Cuenta(1,200);
		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);
		
		Invoker ivk = new Invoker();
		ivk.recibirOperaciones(opDepositar);
		ivk.recibirOperaciones(opRetirar);
		ivk.realizarOperaciones();
	}
}
