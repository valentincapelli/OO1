package ar.edu.unlp.objetos.uno.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private Usuario usuario;
	private String direccion;
	private String nombreDescriptivo;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	public Propiedad(Usuario usuario, String nombreDescriptivo, double precioPorNoche, String direccion) {
		this.usuario = usuario;
		this.nombreDescriptivo = nombreDescriptivo;
		this.precioPorNoche = precioPorNoche;
		this.direccion = direccion;
		this.reservas = new ArrayList<>();
	}
	public Usuario getUsuario() {
		return this.usuario;
	}
	public String getNombreDescriptivo() {
		return this.nombreDescriptivo;
	}
	public double getPrecioPorNoche() {
		return this.precioPorNoche;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	public boolean consultarDisponibilidad(LocalDate inicio, LocalDate fin) {
		return this.reservas.stream()
			.noneMatch(reserva->reserva.seSuperpone(inicio,fin));
	}
	public double calcularIngresos(LocalDate inicio, LocalDate fin) {
		return this.reservas.stream()
			.filter(reserva->reserva.seSuperpone(inicio, fin))
			.mapToDouble(reserva->reserva.calcularPrecio())
			.sum();
	}
}
