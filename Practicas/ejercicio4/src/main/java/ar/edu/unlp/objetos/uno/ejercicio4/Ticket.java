package ar.edu.unlp.objetos.uno.ejercicio4;

import java.time.LocalDate;
import java.util.List;

public class Ticket extends Productos{
	private LocalDate fecha;
	private Productos productos;
	
	public Ticket(List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.productos = new Productos (productos);
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

}
