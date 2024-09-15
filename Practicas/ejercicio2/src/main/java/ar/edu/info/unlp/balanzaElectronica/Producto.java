package ar.edu.info.unlp.balanzaElectronica;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public double getPrecio() {
		return this.peso * this.precioPorKilo;
	}
	
	public double getPeso() {
		return this.peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double pesoPorKilo) {
		this.precioPorKilo = pesoPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
