package ar.edu.unlp.info.oo1.ejercicio24;

public class Conductor extends Usuario{
	private Vehiculo vehiculo;

	public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
		super(nombre, saldo);
		this.vehiculo = vehiculo;
	}
	
	public void cargarSaldo(double monto) {
		if (vehiculo.tieneMenosDeCincoAnios()) {
			this.saldo += monto * 0.99;
		}else {
			this.saldo += monto * 0.9;
		}
	}
	
	public void descontarSaldo(double monto) {
		this.saldo += (vehiculo.getBonificacion()); 
		this.saldo -= monto;
	}
}
