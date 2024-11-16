package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoUnit;

public class Pasajero extends Usuario{
	private List<Viaje> viajes;

	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
		this.viajes = new ArrayList<>();
	}
	
	public void agregarViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}
	
	public boolean debeCobrarComision() {
		return this.viajes.stream().noneMatch(v -> v.getFechaDeViaje().isAfter(LocalDate.now().minusDays(30)));
	}
	
	public void cargarSaldo(double monto) {
		if (this.debeCobrarComision()) {
			this.saldo += monto * 0.9;
		}else {
			this.saldo += monto;
		}
	}
	
	public void descontarSaldo(double monto) {
		if (viajes.size() > 0) {
			this.saldo += 500;
			this.saldo -= monto;
		}else {
			this.saldo -= monto;
		}
	}
	
	public int cantidadViajes() {
		return this.viajes.size();
	}
	
	public boolean tieneSaldo() {
		return this.saldo > 0;
	}
	
}
