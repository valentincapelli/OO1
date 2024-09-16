package ar.edu.unlp.objetos.uno.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza extends Productos{
	
	public void ponerEnCero() {
		this.getProductos().clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);
	}

	public Ticket emitirTicket() {
		Ticket T = new Ticket(this.getProductos());
		return T;
	}
}
