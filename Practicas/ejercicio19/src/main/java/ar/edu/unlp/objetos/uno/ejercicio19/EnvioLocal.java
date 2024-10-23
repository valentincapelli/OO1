package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	private boolean entregaRapida;

	public EnvioLocal(LocalDate fecha, String origen, String destino, double pesoEnGramos, boolean entregaRapida) {
		super(fecha, origen, destino, pesoEnGramos);
		this.entregaRapida = entregaRapida;
	}
	
	@Override
	public double calcularCosto() {
		if (this.entregaRapida)
			return 1500;
		else
			return 1000;
	}
	
	
}
