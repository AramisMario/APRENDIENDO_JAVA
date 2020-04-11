package main;
import observer.SolObservador;
import observer.PesoARGObservador;
import observer.PesoMXObservador;
import observer.Subject;
public class Main {
	public static void main(String args[]) {
		
		Subject subject = new Subject();
		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 dolares tendra: ");
		subject.setEstado(10);
		System.out.println("Si desea cambiar 100 dolares tendra: ");
		subject.setEstado(100);
	}
}
