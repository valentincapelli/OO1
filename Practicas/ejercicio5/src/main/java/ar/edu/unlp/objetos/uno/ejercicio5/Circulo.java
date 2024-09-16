package ar.edu.unlp.objetos.uno.ejercicio5;

public class Circulo implements Figura{
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public Circulo() {
		
	}
	
	public double getArea() {
		return Math.PI * (this.radio * this.radio);
	}

	public double getPerimetro() {
		return Math.PI * this.radio * 2;
	}

	public double getDiametro() {
		return this.radio * 2;
	}

	public void setDiametro(double diametro) {
		this.radio = diametro / 2;
	}

	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
