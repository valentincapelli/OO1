package ar.edu.unlp.objetos.uno.ejercicio15;

import java.time.LocalDate;

public class Consumo {
	private double kWh;
	private double kVArh;
	private LocalDate fecha;
	
	public Consumo(double kWh, double kVArh) {
		this.kWh = kWh;
		this.kVArh = kVArh;
		this.fecha = LocalDate.now();
	}
	public double getkWh() {
		return this.kWh;
	}
	public double getkVArh() {
		return this.kVArh;
	}
	public double calcularFpe() {
		double res = 0;
		return res;
	}
	public boolean hayBonificacion() {
		return (this.calcularFpe() > 0.8);
	}
}
