package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fecha;
	private String origen;
	private String destino;
	private double pesoEnGramos;
	
	public Envio(LocalDate fecha, String origen, String destino, double pesoEnGramos) {
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
		this.pesoEnGramos = pesoEnGramos;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public String getOrigen() {
		return origen;
	}
	public String getDestino() {
		return destino;
	}
	public double getPesoEnGramos() {
		return pesoEnGramos;
	}

	public abstract double calcularCosto();
}
