package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class ServicioMedico {
	private LocalDate fecha;
	private Mascota mascota;
	
	public ServicioMedico(Mascota mascota) {
		this.fecha = LocalDate.now();
		this.mascota = mascota;
	}
	
	public boolean fechaEsDomingo() {
		return this.fecha.getDayOfWeek() == DayOfWeek.SUNDAY;
	}
	
	public Mascota getMascota() {
		return this.mascota;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public abstract double calcularCosto();
	
}
