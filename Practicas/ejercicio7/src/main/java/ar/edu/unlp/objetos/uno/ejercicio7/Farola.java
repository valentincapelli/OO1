package ar.edu.unlp.objetos.uno.ejercicio7;

import java.util.LinkedList;
import java.util.List;

public class Farola {
	private boolean interruptor;
	private List<Farola> neighbors;
	
	public Farola() {
		
	}
	
	public List<Farola> getNeighbors() {
		return new LinkedList<Farola>(this.neighbors);
	}
	
	public void pairWithNeighbor(Farola farola) {
		
	}
	
	public boolean isOn(Farola farola) {
		return false;
	}
	
	public boolean isOff(Farola farola) {
		return false;
	}
	
	public void turnOn() {
		
	}
	
	public void turnOff() {
		
	}
}
