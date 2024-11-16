package ar.edu.unlp.info.oo1.ejercicio23;

public class ExpressADomicilio implements FormaDeEnvio{
	
	public double calcularCostoEnvio(String direccionCliente, String direccionVendedor) {
		return CalculadoraDeDistancia.calcularDistancia(direccionCliente, direccionVendedor) * 0.5;
	}
}
