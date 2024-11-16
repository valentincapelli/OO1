package ar.edu.unlp.objetos.uno.ejercicio25;

public class Vacunacion extends ServicioConParticipacionDeMedico{
	private String nombreVacuna;
	private double costoVacuna;
	
	public Vacunacion(Mascota mascota, Veterinario veterinario, String nombreVacuna, double costoVacuna) {
		super(mascota, veterinario);
		this.nombreVacuna = nombreVacuna;
		this.costoVacuna = costoVacuna;
	}
	
	@Override
	public double calcularCosto() {
		return super.calcularCosto() + 500 + this.costoVacuna; 
	}
}
