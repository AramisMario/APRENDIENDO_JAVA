package main;
import strategy.AntivirusSimple;
import strategy.Contexto;
public class Main {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusSimple());
		contexto.ejecutar();
	}
}
