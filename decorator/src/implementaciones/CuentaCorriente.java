package implementaciones;
import interfaces.ICuentaBancaria;
import model.Cuenta;
public class CuentaCorriente implements ICuentaBancaria{
	
	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("--------------------------");
		System.out.println("Se abrio una cuenta Corriente");
		System.out.println("Cliente: "+ c.getCliente());
	}
}
