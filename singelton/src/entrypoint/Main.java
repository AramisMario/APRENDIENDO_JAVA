package entrypoint;
import singelton.Singelton;

public class Main {
	
	public static void main(String args[]) {
		Singelton miSingelton = Singelton.getSingelton();
		miSingelton.setInfo("message for miSingelton");
		System.out.println(miSingelton.getInfo());
		
		Singelton miOtroSingelton = Singelton.getSingelton();
		System.out.println(miOtroSingelton.getInfo());
	}
}
