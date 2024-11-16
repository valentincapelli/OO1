package ar.edu.unlp.info.oo1.ejercicio23;

public class PagoAlContado implements FormaDePago{

	public PagoAlContado() {
		
	}
	
	@Override
	public double calcularCosto(double precio, int cantidadSolicitada) {
		return precio * cantidadSolicitada;
	}
	
}
