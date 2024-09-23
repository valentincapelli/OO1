package ar.edu.unlp.objetos.uno.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	
	public Ticket() {
		
	}
	
	public Ticket(List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.productos = new ArrayList<Producto>();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
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
