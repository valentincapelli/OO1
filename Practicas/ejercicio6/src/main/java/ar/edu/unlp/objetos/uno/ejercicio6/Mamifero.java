package ar.edu.unlp.objetos.uno.ejercicio6;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate FechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero () {
		
	}
	
	public Mamifero (String identificador) {
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.madre != null)
			return this.madre.getPadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre != null)
			return this.madre.getMadre();
		else
			return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.padre != null)
			return this.padre.getPadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.padre != null)
			return this.padre.getMadre();
		else
			return null;
	}
	
	public boolean tieneComoAncestroA (Mamifero unMamifero) {
		return metodoHelper(this, unMamifero);
	}
	
	private boolean metodoHelper(Mamifero actual, Mamifero unMamifero) {
		boolean result = false;
		if (actual != null) {
			if (actual.equals(unMamifero)) {
				result = true;
			}
			else {
				result = metodoHelper(actual.padre, unMamifero);
				if (!result)
					result = metodoHelper(actual.madre, unMamifero);
			}
		}
		return result;
	}
}
