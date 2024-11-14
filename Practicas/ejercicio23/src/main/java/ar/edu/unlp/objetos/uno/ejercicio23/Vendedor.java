package ar.edu.unlp.objetos.uno.ejercicio23;

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
	
}
