package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{
	private String paisDestino;
	
	public EnvioInternacional(LocalDate fecha, String origen, String destino, double pesoEnGramos, String paisDestino) {
		super(fecha, origen, destino, pesoEnGramos);
		this.paisDestino = paisDestino;
	}

	public String getPaisDestino() {
		return paisDestino;
	}
	
	@Override
	public double calcularCosto() {
		double res = 5000;
		if (this.getPesoEnGramos() > 1000)
			res += 12 * this.getPesoEnGramos();
		else
			res+= 10 * this.getPesoEnGramos();
		return res;
	}
}
