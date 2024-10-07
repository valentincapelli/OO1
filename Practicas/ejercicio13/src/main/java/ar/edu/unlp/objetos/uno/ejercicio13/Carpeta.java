package ar.edu.unlp.objetos.uno.ejercicio13;

import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
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
		if (this.emails.contains(email)) {
			this.emails.remove(email);
			destino.agregarEmail(email);
			System.out.print("El mail se movio de carpeta.");
		}
		System.out.print("No se pudo mover el email.");
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
	
}
