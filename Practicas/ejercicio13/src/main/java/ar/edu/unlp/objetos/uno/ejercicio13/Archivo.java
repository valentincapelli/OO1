package ar.edu.unlp.objetos.uno.ejercicio13;

public class Archivo {
	private String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public int tamaño() {
		return this.nombre.length();
	}
	
}
