package ar.edu.unlp.objetos.uno.ejercicio5;

public class Circulo implements Figura{
	private double diametro;
	private double radio;
	
	public Circulo(double diametro) {
		this.diametro = diametro;
		this.radio = (diametro / 2);
	}
	
	public double getArea() {
		return Math.PI * (this.radio * this.radio);
	}
	
	public double getPerimetro() {
		return Math.PI * this.diametro;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getRadio() {
		return radio;
	}
	
}
