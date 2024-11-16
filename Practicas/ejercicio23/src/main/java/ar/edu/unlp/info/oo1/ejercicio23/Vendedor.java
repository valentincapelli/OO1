package ar.edu.unlp.info.oo1.ejercicio23;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona{
	private List<Producto> productos;
	
	public Vendedor(String nombre, String direccion) {
		super(nombre, direccion);
		this.productos = new ArrayList<>();
	}

	public List<Producto> getProductos() {
		return new ArrayList<>(this.productos);
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
}
