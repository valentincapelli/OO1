package ar.edu.unlp.info.oo1.ejercicio24;

public abstract class Usuario {
	private String nombre;
	protected double saldo;
	
	public Usuario(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public abstract void descontarSaldo(double monto);
	public abstract void cargarSaldo(double monto);
}
