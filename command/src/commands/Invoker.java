package commands;

import java.util.List;
import java.util.ArrayList;
import commands.IOperacion;
public class Invoker {
	private List<IOperacion> operaciones = new ArrayList<>();
	
	public void recibirOperaciones(IOperacion operacion) {
		this.operaciones.add(operacion);
	}
	public void realizarOperaciones() {
		this.operaciones.forEach(x -> x.execute());
	}
	
}
