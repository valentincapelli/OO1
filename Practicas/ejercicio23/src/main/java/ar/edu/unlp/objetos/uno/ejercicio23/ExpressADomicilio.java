package ar.edu.unlp.objetos.uno.ejercicio23;

public class ExpressADomicilio implements FormaDeEnvio{
	
	public ExpressADomicilio() {
		
	}
	
	public double calcularCostoEnvio(String direccionCliente, String direccionVendedor) {
		return CalculadoraDeDistancia.calcularDistancia(direccionCliente, direccionVendedor) * 0.5;
	}
}
