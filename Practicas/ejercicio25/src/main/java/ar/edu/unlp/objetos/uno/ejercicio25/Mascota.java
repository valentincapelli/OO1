package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String especie;
	private List<ServicioMedico> servicios;
	
	public Mascota(String nombre, LocalDate fechaDeNacimiento, String especie) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.especie = especie;
		this.servicios = new ArrayList<>();
	}
	
	public ServicioGuarderia altaServicioGuarderia(int dias) {
		ServicioGuarderia servicioGuarderia = new ServicioGuarderia(this, dias);
		this.servicios.add(servicioGuarderia);
		return servicioGuarderia;
	}
	
	public Consulta altaConsulta(Veterinario veterinario) {
		Consulta consulta = new Consulta(this, veterinario);
		this.servicios.add(consulta);
		return consulta;
	}
	
	public Vacunacion altaVacunacion(Veterinario veterinario, String nombreVacuna, double precioVacuna) {
		Vacunacion vacunacion = new Vacunacion(this, veterinario, nombreVacuna, precioVacuna);
		this.servicios.add(vacunacion);
		return vacunacion;
	}
	
	private void agregarServicio(ServicioMedico servicioMedico) {
		this.servicios.add(servicioMedico);
	}
	
	public boolean tieneMasDeCincoServicios() {
		return this.servicios.size() >= 5;
	}
	
	public double calcularMontoEnFecha(LocalDate fecha) {
		return this.servicios.stream()
				.filter(servicio->servicio.getFecha().equals(fecha))
				.mapToDouble(servicio->servicio.calcularCosto()).sum();
	}
	
	public int getCantServicios() {
		return this.servicios.size();
	}
}
