package ar.edu.unlp.objetos.uno.ejercicio23;

public class PagoAlContado implements FormaDePago{

	public PagoAlContado() {
		
	}
	public double calcularCosto(double precio, int cantidadSolicitada) {
		return precio * cantidadSolicitada;
	}
	
}
