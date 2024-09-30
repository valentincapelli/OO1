package ar.edu.unlp.objetos.uno.ejercicio9;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		this.descubierto = 0;
	}
	
	public CuentaCorriente(double descubierto) {
		this.descubierto = descubierto;
	}

	public double getDescubierto() {
		return this.descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		return (monto <= this.getDescubierto() + this.getSaldo());
	}
	
}
