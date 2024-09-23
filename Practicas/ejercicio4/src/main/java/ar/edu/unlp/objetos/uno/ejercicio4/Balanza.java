package ar.edu.unlp.objetos.uno.ejercicio4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public Ticket emitirTicket() {
		Ticket T = new Ticket(new ArrayList<Producto>(this.productos));
		return T;
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
		return new LinkedList<Producto>(this.productos);
	}
	
}
