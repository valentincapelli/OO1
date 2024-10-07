package ar.edu.unlp.objetos.uno.ejercicio13;

public class Archivo {
	private String nombre;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int tamaño() {
		return this.nombre.length();
	}
	
}
