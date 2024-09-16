package ar.edu.unlp.objetos.uno.ejercicio5;

public class Cuadrado implements Figura{
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double getArea() {
		return lado * lado;
	}
	
	public double getPerimetro() {
		return lado * 4;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
}
