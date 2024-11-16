package ar.edu.unlp.objetos.uno.ejercicio25;

public class ServicioGuarderia extends ServicioMedico{
	private int cantidadDeDias;

	public ServicioGuarderia(Mascota mascota, int cantidadDeDias) {
		super(mascota);
		this.cantidadDeDias = cantidadDeDias;
	}

	@Override
	public double calcularCosto() {
		double resultado = this.cantidadDeDias * 500;
		if (this.getMascota().tieneMasDeCincoServicios())
			return resultado * 0.9;
		return resultado;
	}
}
