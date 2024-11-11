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
	
	public void eliminarReserva() {
		this.propiedad.eliminarReserva(this);
	}
	
	public double calcularPrecio() {
		return this.duracion.sizeInDays() * this.propiedad.getPrecioPorNoche();
	}
	
	public boolean seSuperpone(LocalDate inicio, LocalDate fin) {
		DateLapse dl = new DateLapse(inicio, fin);
		return dl.overlaps(this.duracion);
	}
	
	public boolean estaEnCurso() {
		return this.duracion.includesDate(LocalDate.now());
	}
}
