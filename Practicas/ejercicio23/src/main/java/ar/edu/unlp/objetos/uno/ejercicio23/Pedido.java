package ar.edu.unlp.objetos.uno.ejercicio23;

public class Pedido {
	private Cliente cliente;
	private Producto producto;
	private FormaDePago formaDePago;
	private FormaDeEnvio formaDeEnvio;
	private int cantidadSolicitada;
	
	public Pedido(Cliente cliente, Producto producto, FormaDePago formaDePago, FormaDeEnvio formaDeEnvio, int cantidadSolicitada) {
		this.cliente = cliente;
		this.producto = producto;
		this.formaDePago = formaDePago;
		this.formaDeEnvio = formaDeEnvio;
		this.cantidadSolicitada = cantidadSolicitada;
	}

	public Producto getProducto() {
		return producto;
	}
	
	public String getCategoriaProducto() {
		return producto.getCategoria();
	}
	
	public double calcularCostoTotal() {
		return formaDePago.calcularCosto(producto.getPrecio(), cantidadSolicitada) + formaDeEnvio.calcularCostoEnvio(this.cliente.getDireccion(), this.producto.getDireccionVendedor());
	}
	
}
