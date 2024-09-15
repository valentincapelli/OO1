package ar.edu.unlp.objetos.uno.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Productos {
	private List<Producto> productos;
	
	public Productos() {
		this.productos = new ArrayList<Producto>();
	}
	
	public Productos(List<Producto> listaProductos) {
		this.productos = productos;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto producto : this.productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

	public double getPesoTotal() {
		double pesoTotal = 0;
		for (Producto producto : this.productos) {
			pesoTotal += producto.getPeso();
		}
		return pesoTotal;
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
}
