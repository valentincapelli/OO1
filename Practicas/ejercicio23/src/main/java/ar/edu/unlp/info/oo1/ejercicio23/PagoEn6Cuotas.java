package ar.edu.unlp.info.oo1.ejercicio23;

public class PagoEn6Cuotas implements FormaDePago{
	
	public PagoEn6Cuotas() {
		
	}
	
	public double calcularCosto(double precio, int cantidadSolicitada) {
		return (precio * cantidadSolicitada) * 1.20;
	}
}
