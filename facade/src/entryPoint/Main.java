package entryPoint;
import facade.CheckFacade;
public class Main {
	public static void main(String args[]) {
		
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2018","08/07/2018","Lima","Cancun");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2018","08/07/2018","Lima","Quito");
		
	}
}
