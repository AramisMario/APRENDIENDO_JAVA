package observer;

public class PesoARGObservador extends Observador{
	
private double valorCambio = 20.86;
	
	public PesoARGObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	@Override 
	public void actualizar() {
		System.out.println("ARG: "+(sujeto.getEstado()*valorCambio));
	}
}

