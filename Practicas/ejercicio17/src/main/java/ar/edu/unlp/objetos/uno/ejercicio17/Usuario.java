package ar.edu.unlp.objetos.uno.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String dni;
	private String direccion;
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
	
	public boolean crearReserva() {
		
	}
	
	public double calcularIngresos() {
		
	}
}
