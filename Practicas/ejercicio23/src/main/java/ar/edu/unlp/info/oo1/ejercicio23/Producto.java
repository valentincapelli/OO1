package ar.edu.unlp.info.oo1.ejercicio23;

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
		this.vendedor.agregarProducto(this);
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
	private void descontar(int cantidadSolicitada) {
		this.cantUnidadesDisponibles = this.cantUnidadesDisponibles - cantidadSolicitada;
	}
	public String getDireccionVendedor() {
		return this.vendedor.getDireccion();
	}
	
	public void generarPedido(Cliente cliente, FormaDePago formaDePago, FormaDeEnvio formaDeEnvio, int cantidadSolicitada) {
		if (this.getCantUnidadesDisponibles() >= cantidadSolicitada) {
			this.descontar(cantidadSolicitada);
			cliente.agregarPedido(new Pedido(cliente, this, formaDePago, formaDeEnvio, cantidadSolicitada));
		}
	}
}
