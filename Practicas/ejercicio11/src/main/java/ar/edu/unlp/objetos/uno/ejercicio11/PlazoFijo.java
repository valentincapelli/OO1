package ar.edu.unlp.objetos.uno.ejercicio11;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	public PlazoFijo() {
		
	}
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}
	public double getMontoDepositado() {
		return montoDepositado;
	}
	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}
	
	public double calcularIntereses() {
		if (this.porcentajeDeInteresDiario > 0) {
			long cantDias = ChronoUnit.DAYS.between(this.fechaDeConstitucion, LocalDate.now());
			return cantDias * this.porcentajeDeInteresDiario;
		}
		else
			return 0.0;
	}
	
	public double valorActual() {
		return (this.montoDepositado + (this.montoDepositado * this.calcularIntereses()));
	}
	
}