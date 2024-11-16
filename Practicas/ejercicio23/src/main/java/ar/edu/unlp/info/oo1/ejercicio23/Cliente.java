package ar.edu.unlp.info.oo1.ejercicio23;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{
	private List<Pedido> pedidos;
	
	public Cliente(String nombre, String direccion) {
		super(nombre, direccion);
		this.pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return new ArrayList<>(this.pedidos);
	}
	
	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public BagImpl<String> conocerCantidadPorCategoria() {
		BagImpl<String> bag = new BagImpl<>();
		this.pedidos.forEach(pedido->bag.add(pedido.getCategoriaProducto())); 
		//this.pedidos.stream().map(pedido->bag.add(pedido.getCategoriaProducto()));
		return bag;
	}
	
}
