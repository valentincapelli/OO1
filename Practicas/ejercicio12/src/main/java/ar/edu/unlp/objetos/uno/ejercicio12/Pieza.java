package ar.edu.unlp.objetos.uno.ejercicio12;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}
	public Pieza() {
		
	}
	public String getMaterial() {
		return material;
	}
	public String getColor() {
		return color;
	}
	
	public abstract double getVolumen();
	
	public abstract double getSuperficie();
}
