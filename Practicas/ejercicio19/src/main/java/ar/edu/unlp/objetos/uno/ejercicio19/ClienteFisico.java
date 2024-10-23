package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;

public class ClienteFisico extends Cliente{
	private String dni;
	
	public ClienteFisico (String nombre, String direccion, String dni) {
		super(nombre, direccion);
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
	}
	
	public double montoAPagar(LocalDate inicio, LocalDate fin) {
		return 0.90 * super.montoAPagar(inicio, fin);
	}
	
}
