package ar.edu.unlp.objetos.uno.ejercicio11;

public class InversionEnAcciones implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}
	
	public InversionEnAcciones() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public double valorActual() {
		return this.cantidad * this.valorUnitario;
	}
}
