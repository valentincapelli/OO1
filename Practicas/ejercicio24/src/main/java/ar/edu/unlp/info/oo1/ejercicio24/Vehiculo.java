package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;

public class Vehiculo {
	private String descripcion;
	private int capacidadDePasajeros;
	private int anioDeFabricacion;
	private double valor;
	private Conductor conductor;
	
	public Vehiculo(String descripcion, int capacidadDePasajeros, int anioDeFabricacion, double valor, Conductor conductor) {
		this.descripcion = descripcion;
		this.capacidadDePasajeros = capacidadDePasajeros;
		this.anioDeFabricacion = anioDeFabricacion;
		this.valor = valor;
		this.conductor = conductor;
	}

	public int getCapacidadDePasajeros() {
		return this.capacidadDePasajeros;
	}

	public Conductor getConductor() {
		return this.conductor;
	}
	
	public boolean tieneMenosDeCincoAnios() {
		return (LocalDate.now().getYear() - this.anioDeFabricacion) < 5;
	}
	
	public double getBonificacion() {
		return this.valor * 0.01;
	}
	
	public boolean hayLugarPara(int cantPasajeros) {
		return cantPasajeros < this.capacidadDePasajeros;
	}
}
