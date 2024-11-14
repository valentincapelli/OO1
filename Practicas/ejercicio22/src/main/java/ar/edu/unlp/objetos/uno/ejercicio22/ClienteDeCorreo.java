package ar.edu.unlp.objetos.uno.ejercicio22;

import java.util.LinkedList;
import java.util.List;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo() {
		this.carpetas = new LinkedList<>();
		inbox = new Carpeta("Inbox", new LinkedList<>());
	}
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	public List<Carpeta> getCarpetas() {
		return new LinkedList<>(carpetas);
	}
	public Carpeta getInbox() {
		return inbox;
	}
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		Email e = this.inbox.buscar(texto);
		if (e == null)
			e = this.carpetas.stream()
				.map(carpeta->carpeta.buscar(texto))
				.filter(email->email != null)
				.findFirst().orElse(null);
			
		return e;
	}
	
	public int espacioOcupado() {
		return this.inbox.espacioOcupado() +
				this.carpetas.stream()
				.mapToInt(carpeta->carpeta.espacioOcupado())
				.sum();
	}
	
	public int cantidadTotalEmails() {
		int result = this.inbox.cantidadEmails();
		result += this.carpetas.stream().mapToInt(carpeta->carpeta.cantidadEmails()).sum();
		return result;
	}
	
}