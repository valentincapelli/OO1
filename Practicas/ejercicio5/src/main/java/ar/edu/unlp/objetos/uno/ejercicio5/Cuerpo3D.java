package ar.edu.unlp.objetos.uno.ejercicio5;

public class Cuerpo3D {
	private Figura caraBasal;
	private double altura;
	
	public Cuerpo3D (Figura figura, double altura) {
		this.caraBasal = figura;
		this.altura = altura;
	}
	
	public Cuerpo3D () {
		
	}

	public Figura getCaraBasal() {
		return caraBasal;
	}

	public void setCaraBasal(Figura figura) {
		this.caraBasal = figura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
