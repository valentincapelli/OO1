package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
	private int distanciaEnKm;
	
	public int getDistanciaEnKm() {
		return distanciaEnKm;
	}

	public void setDistanciaEnKm(int distanciaEnKm) {
		this.distanciaEnKm = distanciaEnKm;
	}

	public EnvioInterurbano(LocalDate fecha, String origen, String destino, double pesoEnGramos, int distanciaEnKm) {
		super(fecha, origen, destino, pesoEnGramos);
		this.distanciaEnKm = distanciaEnKm;
	}

	@Override
	public double calcularCosto() {
		if (this.distanciaEnKm < 100) {
			return 20 * this.getPesoEnGramos();
		} else if (this.distanciaEnKm <= 500) {
			return 25 * this.getPesoEnGramos();
		} else {
			return 30 * this.getPesoEnGramos();
		}
	}
	
}
