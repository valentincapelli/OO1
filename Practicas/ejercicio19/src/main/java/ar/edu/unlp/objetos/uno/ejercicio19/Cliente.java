package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new ArrayList<>();
	}

	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	
	public double montoAPagar(LocalDate inicio, LocalDate fin) {
		return this.envios.stream().filter(envio->envio.getFecha().isAfter(inicio) && envio.getFecha().isBefore(fin))
				.mapToDouble(envio->envio.calcularCosto()).sum();
	}
	
}
