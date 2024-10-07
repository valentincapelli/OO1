package ar.edu.unlp.objetos.uno.ejercicio12;

import java.util.LinkedList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;

	public List<Pieza> getPiezas() {
		return new LinkedList<Pieza>(piezas);
	}

	public void setPiezas(List<Pieza> piezas) {
		this.piezas = piezas;
	}
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double volumenDeMaterial(String material) {
		return this.piezas.stream()
		.filter(pieza->pieza.getMaterial() == material)
		.mapToDouble(pieza->pieza.getVolumen())
		.sum();
	}
	
	public double superficieDeColor(String color) {
		return this.piezas.stream()
				.filter(pieza->pieza.getColor() == color)
				.mapToDouble(pieza->pieza.getSuperficie())
				.sum();
	}
}
