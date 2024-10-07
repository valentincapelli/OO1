package ar.edu.unlp.objetos.uno.ejercicio12;

public class Esfera extends Pieza{
	private int radio;

	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}
	
	public Esfera() {
		super();
	}

	public int getRadio() {
		return this.radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double getVolumen() {
		return (4/3) * Math.PI * Math.pow(this.radio, 3);
	}
	
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.radio, 2);
	}
}
