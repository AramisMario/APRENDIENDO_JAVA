package main;
import memento.Juego;
import memento.Caretaker;
import memento.Originator;
public class Main {
	
	public static void main(String[] args) {
		String nombreJuego = "Crash Bandicoot";
		Juego juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(1);
		
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(2);
		originator.setEstado(juego);
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(3);
		originator.setEstado(juego);	
		
		caretaker.addMemento(originator.guardar());
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(4);
		
		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar());
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(5);
		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar());
		
		originator.setEstado(juego);
		originator.restaurar(caretaker.getMemento(0));
		
		juego = originator.getEstado();
		System.out.println(juego);
	}
}
