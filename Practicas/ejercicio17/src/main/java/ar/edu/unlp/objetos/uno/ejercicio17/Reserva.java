package ar.edu.unlp.objetos.uno.ejercicio17;

import java.time.LocalDate;

import ar.edu.unlp.objetos.uno.ejercicio14.DateLapse;

public class Reserva {
	private Propiedad propiedad;
	private DateLapse duracion;
	
	public Reserva(Propiedad propiedad, LocalDate fechaInicial, LocalDate fechaFinal) {
		this.propiedad = propiedad;
		this.duracion = new DateLapse(fechaInicial, fechaFinal);
	}
	public Propiedad getPropiedad() {
		return this.propiedad;
	}
	public DateLapse getDuracion() {
		return this.duracion;
	}
	
	public double calcularPrecio() {
		return duracion.sizeInDays() * this.propiedad.getPrecioPorNoche();
	}
}
