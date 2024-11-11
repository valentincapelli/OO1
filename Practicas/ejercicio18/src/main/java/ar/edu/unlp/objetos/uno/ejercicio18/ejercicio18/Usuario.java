package ar.edu.unlp.objetos.uno.ejercicio18.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private String dni;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String dni, String direccion) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.propiedades = new ArrayList<>();
		this.reservas = new ArrayList<>();
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getDni() {
		return this.dni;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public List<Propiedad> getPropiedades() {
		return new ArrayList<>(propiedades);
	}
	public List<Reserva> getReservas() {
		return new ArrayList<>(reservas);
	}
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void crearReserva(Propiedad propiedad, LocalDate inicio, LocalDate fin) {
		if (propiedad.consultarDisponibilidad(inicio, fin)) {
			Reserva r = new Reserva(propiedad, inicio, fin);
			this.reservas.add(r);
			propiedad.agregarReserva(r);
		}
	}
	
	public void cancelarReserva(Reserva reserva) {
		if (reserva.estaEnCurso()) {
			this.reservas.remove(reserva);
			reserva.eliminarReserva();
		}
	}
	
	public double calcularIngresos(LocalDate inicio, LocalDate fin) {
		return 0.75 * this.propiedades.stream()
			.mapToDouble(propiedad->propiedad.calcularIngresos(inicio, fin)).sum();
	}
}
