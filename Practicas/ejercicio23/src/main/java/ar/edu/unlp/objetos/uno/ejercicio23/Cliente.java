package ar.edu.unlp.objetos.uno.ejercicio23;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.objetos.uno.ejercicio21.BagImpl;

public class Cliente extends Persona{
	private List<Pedido> pedidos;
	
	public Cliente(String nombre, String direccion) {
		super(nombre, direccion);
		this.pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return new ArrayList<>(this.pedidos);
	}
	
	public void crearPedido(FormaDePago formaDePago, FormaDeEnvio formaDeEnvio, Producto producto, int cantidadSolicitada) {
		if (producto.getCantUnidadesDisponibles() > cantidadSolicitada) {
			this.pedidos.add(new Pedido(this, producto, formaDePago, formaDeEnvio, cantidadSolicitada));
			producto.descontar(cantidadSolicitada);
		}
	}
	
	// Consultar
	public BagImpl<String> conocerCantidadPorCategoria() {
		BagImpl<String> bag = new BagImpl<>();
		this.pedidos.stream().map(pedido->bag.add(pedido.getCategoriaProducto()));
		return bag;
	}
	
}
