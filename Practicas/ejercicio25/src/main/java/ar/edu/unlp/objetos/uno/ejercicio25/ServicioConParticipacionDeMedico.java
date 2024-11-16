package ar.edu.unlp.objetos.uno.ejercicio25;

public abstract class ServicioConParticipacionDeMedico extends ServicioMedico{
	private Veterinario veterinario;

	public ServicioConParticipacionDeMedico(Mascota mascota, Veterinario veterinario) {
		super(mascota);
		this.veterinario = veterinario;
	}
	
	public double calcularCosto() {
		double resultado = this.veterinario.getHonorarios();
		if (this.fechaEsDomingo())
			resultado += 200;
		return resultado;
	}
	
	public Veterinario getVeterinario() {
		return this.veterinario;
	}
}
