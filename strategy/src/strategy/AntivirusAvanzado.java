package strategy;

public class AntivirusAvanzado extends AnalisisAvanzado{
	
	@Override
	void iniciar() {
		System.out.println("Antivirus Avanzado - Analisis avanzado iniciado");
	}
	
	@Override
	void analizarMemoria() {
		try {
			System.out.println("Analizando Memoria RAM...");
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override 
	void analizarKeyloggers() {
		try {
			System.out.println("Analizando en busca de Keyloggers...");
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	void analizarRootKits() {
		try {
			System.out.println("Analizando en busca de RootKits");
			Thread.sleep(1500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	void descomprimirZip() {
		System.out.println("Descomprimiendo zip");
	}
	@Override
	void detener() {
		System.out.println("Finalizado");
	}
}
