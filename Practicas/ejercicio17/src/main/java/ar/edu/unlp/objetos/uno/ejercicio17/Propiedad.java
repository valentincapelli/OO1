package ar.edu.unlp.objetos.uno.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private Usuario usuario;
	private String nombreDescriptivo;
	private double precioPorNoche;
	private String direccion;
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
	public boolean consultarDisponibilidad(LocalDate inicio, LocalDate fin) {
		
	}
}
