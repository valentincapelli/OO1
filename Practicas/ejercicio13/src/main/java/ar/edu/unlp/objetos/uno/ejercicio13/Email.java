package ar.edu.unlp.objetos.uno.ejercicio13;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivosAdjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.archivosAdjuntos = new LinkedList<Archivo>();
	}
	public void agregarArchivoAdjunto(Archivo archivo) {
		this.archivosAdjuntos.add(archivo);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public List<Archivo> getArchivosAdjuntos() {
		return archivosAdjuntos;
	}
	public void setArchivosAdjuntos(List<Archivo> archivosAdjuntos) {
		this.archivosAdjuntos = archivosAdjuntos;
	}
	public boolean buscar(String texto) {
		return (this.titulo.contains(texto) || (this.cuerpo.contains(texto)));
	}
	
	public int tamaño() {
		return this.titulo.length()
				+ this.cuerpo.length()
				+ this.archivosAdjuntos.stream()
				.mapToInt(archivo->archivo.tamaño())
				.sum();
	}
	
}
