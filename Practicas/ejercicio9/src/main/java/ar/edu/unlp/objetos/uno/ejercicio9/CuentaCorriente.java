package ar.edu.unlp.objetos.uno.ejercicio9;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	
	public CuentaCorriente(double descubierto) {
		super();
		this.descubierto = descubierto;
	}

	public double getDescubierto() {
		return this.descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		if (monto <= (this.getDescubierto() + this.getSaldo()))
			return true;
		else
			return false;
	}
	
	// Consultar metodo
	protected void extraerSinControlar(double monto) {
		if (monto > this.getSaldo()) {
			this.descubierto = (this.descubierto - (monto - this.getSaldo()));
			this.setSaldo(0);
		}
		else
			this.setSaldo(this.getSaldo() - monto);
	}
	
}
