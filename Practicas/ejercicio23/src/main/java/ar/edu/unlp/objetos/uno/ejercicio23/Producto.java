package ar.edu.unlp.objetos.uno.ejercicio23;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int cantUnidadesDisponibles;
	private Vendedor vendedor;
	
	public Producto(String nombre, String categoria, double precio, int cantUnidadesDisponibles, Vendedor vendedor) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.cantUnidadesDisponibles = cantUnidadesDisponibles;
		this.vendedor = vendedor;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public int getCantUnidadesDisponibles() {
		return cantUnidadesDisponibles;
	}
	public void descontar(int cantidadSolicitada) {
		this.cantUnidadesDisponibles -= cantidadSolicitada;
	}
	public String getDireccionVendedor() {
		return this.vendedor.getDireccion();
	}
}
