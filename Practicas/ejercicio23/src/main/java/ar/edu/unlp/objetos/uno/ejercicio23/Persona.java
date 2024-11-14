package ar.edu.unlp.objetos.uno.ejercicio23;

public abstract class Persona {
	private String nombre;
	private String direccion;
	
	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion(){
		return this.direccion;
	}
}
