package ar.edu.unlp.objetos.uno.ejercicio13;

import java.util.LinkedList;
import java.util.List;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public List<Carpeta> getCarpetas() {
		return new LinkedList(carpetas);
	}
	public Carpeta getInbox() {
		return inbox;
	}
	
	public Email buscar(String texto) {
		Email e = this.inbox.buscar(texto);
		if (e == null)
			e = this.carpetas.stream()
				.filter(carpeta->carpeta.buscar(texto))
				.findFirst().orElse(null)
			
		return e;
	}
	
	public int espacioOcupado() {
		return this.inbox.espacioOcupado() +
				this.carpetas.stream()
				.mapToInt(carpeta->carpeta.espacioOcupado())
				.sum();
	}
}
