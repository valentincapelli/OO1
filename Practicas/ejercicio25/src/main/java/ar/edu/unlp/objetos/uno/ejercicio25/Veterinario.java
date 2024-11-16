package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio24.DateLapse;

public class Veterinario {
	private String nombre;
	private LocalDate fechaDeIngreso;
	private double honorarios;
	
	public Veterinario(String nombre, LocalDate fechaDeIngreso, double honorarios) {
		this.nombre = nombre;
		this.fechaDeIngreso = fechaDeIngreso;
		this.honorarios = honorarios;
	}
	
	public double getHonorarios() {
		return this.honorarios;
	}
	
	public int getAniosDeAntiguedad() {
		return LocalDate.now().getYear() - this.fechaDeIngreso.getYear();
	}
}
