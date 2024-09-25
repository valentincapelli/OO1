package ar.edu.unlp.objetos.uno.ejercicio7;

import java.util.LinkedList;
import java.util.List;

public class Farola {
	private boolean interruptor;
	private List<Farola> neighbors;
	
	public Farola() {
		this.neighbors = new LinkedList<>();
		this.interruptor = false;
	}
	
	public List<Farola> getNeighbors() {
		return new LinkedList<Farola>(this.neighbors);
	}
	
	public void pairWithNeighbor(Farola farola) {
		if (!this.neighbors.contains(farola)) {
			this.pairNeighbor(farola);
			farola.pairNeighbor(this);
		}
	}
	
	private void pairNeighbor(Farola farola) {
		this.neighbors.add(farola);	
	}
	
	public boolean isOn() {
		return this.interruptor;
	}
	
	public boolean isOff() {
		return !this.isOn();
	}
	
	public void turnOn() {
		if (this.isOff()) {
			this.interruptor = true;
			for (Farola farola : this.neighbors) {   // Usando for each
				farola.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if (this.isOn()) {
			this.interruptor = false;
			
			this.neighbors.stream()    // Usando stream
				.forEach(Farola::turnOff); // a cada farola de la lista le aplica turnOff
		}
	}
}
