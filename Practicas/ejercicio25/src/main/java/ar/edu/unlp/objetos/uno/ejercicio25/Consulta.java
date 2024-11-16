package ar.edu.unlp.objetos.uno.ejercicio25;

public class Consulta extends ServicioConParticipacionDeMedico{
	
	public Consulta(Mascota mascota, Veterinario veterinario) {
		super(mascota, veterinario);
	}

	@Override
	public double calcularCosto() {
		return super.calcularCosto() + 300 + (100 * this.getVeterinario().getAniosDeAntiguedad());
	}
	
}
