package ar.edu.unlp.objetos.uno.ejercicio25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioGuarderiaTest {
	private ServicioGuarderia servicioGuarderia;
	private Mascota mascota;
	
	@BeforeEach
	public void setUp() {
		mascota = new Mascota("Fabio", LocalDate.of(2004, 2, 10), "Salchicha");
	}
	
	
	@Test
	public void calcularCostoTest() {
		servicioGuarderia = new ServicioGuarderia(mascota, 5);
		assertEquals(2500,servicioGuarderia.calcularCosto());
		mascota.altaServicioGuarderia(2);
		mascota.altaServicioGuarderia(2);
		mascota.altaServicioGuarderia(2);
		mascota.altaServicioGuarderia(2);
		assertEquals(2500,servicioGuarderia.calcularCosto());
		mascota.altaServicioGuarderia(2);
		assertEquals(2250,servicioGuarderia.calcularCosto());
		mascota.altaServicioGuarderia(2);
		assertEquals(2250,servicioGuarderia.calcularCosto());
	}
}
