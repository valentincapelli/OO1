package ar.edu.unlp.objetos.uno.ejercicio22;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ar.edu.unlp.objetos.uno.ejercicio21.BagImpl;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre, List<Email> emails) {
		super();
		this.nombre = nombre;
		this.emails = emails;
	}
	
	public Carpeta(String nombre) {
		this.emails = new LinkedList();
	}
	
	public Carpeta() {
		this.emails = new LinkedList();
	}

	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Email> getEmails() {
		return emails;
	}
	
	public void mover(Email email, Carpeta destino) {
		this.emails.remove(email);
		destino.agregarEmail(email);
		System.out.print("El mail se movio de carpeta.");
	}
	
	public int espacioOcupado() {
		return this.emails.stream()
				.mapToInt(email->email.tamaño())
				.sum();
	}
	
	public Email buscar(String texto) {
		return this.emails.stream()
					.filter(email->email.buscar(texto))
					.findFirst().orElse(null);
	}
	
	public int cantidadEmails() {
		return this.emails.size();
	}
	
	public BagImpl<String> cantidadEmailsPorCategoria(){
		BagImpl<String> bag = new BagImpl<>();
		this.emails.forEach(email->bag.add(email.tipoDeTamaño()));
		return bag;
	}
	
}