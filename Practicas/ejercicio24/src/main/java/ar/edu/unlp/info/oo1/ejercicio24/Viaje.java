package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	private String origen;
	private String destino;
	private double costoTotal;
	private LocalDate fechaDeViaje;
	private Vehiculo vehiculo;
	private List<Usuario> pasajeros;
	
	public Viaje(String origen, String destino, double costoTotal, LocalDate fechaDeViaje, Vehiculo vehiculo) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.fechaDeViaje = fechaDeViaje;
		this.vehiculo = vehiculo;
		this.pasajeros = new ArrayList<>();
		this.pasajeros.add(this.vehiculo.getConductor());
	}
	
	public void registrarViaje(Pasajero pasajero) {
		DateLapse dateLapse = new DateLapse(LocalDate.now(), this.fechaDeViaje);
		if (dateLapse.sizeInDays() > 2 && pasajero.tieneSaldo() && this.hayCapacidad()) {
			this.agregarPasajero(pasajero);
			pasajero.agregarViaje(this);
		}
	}
	
	public LocalDate fechaDeViaje() {
		return this.fechaDeViaje;
	}
	
	public boolean hayCapacidad() {
		return this.vehiculo.hayLugarPara(this.pasajeros.size());
	}
	
	private void agregarPasajero(Usuario pasajero) {
		this.pasajeros.add(pasajero);
	}
	
	public LocalDate getFechaDeViaje() {
		return this.fechaDeViaje;
	}
	
	public double montoAPagar() {
		return this.costoTotal / this.pasajeros.size();
	}
	
	public void procesarViaje() {
		this.pasajeros.forEach(pasajero->pasajero.descontarSaldo(this.montoAPagar()));
	}
	
	public int cantidadPasajeros() {
		return this.pasajeros.size();
	}
}
