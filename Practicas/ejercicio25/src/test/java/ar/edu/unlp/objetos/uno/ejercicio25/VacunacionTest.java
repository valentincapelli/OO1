package ar.edu.unlp.objetos.uno.ejercicio25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VacunacionTest {
	private Mascota mascota;
	
	@BeforeEach
	public void setUp() {
		mascota = new Mascota("Fabio", LocalDate.of(2004, 2, 10), "Salchicha");
	}
	
	
	@Test
	public void calcularCostoTest() {
		Vacunacion vacunacion = new Vacunacion(mascota, new Veterinario("valen", LocalDate.of(2020, 1, 1), 10), "Pfizer", 1000);
		assertEquals(1510, vacunacion.calcularCosto());
	}
	
	@Test
	public void calcularCostoTest() {
		Vacunacion vacunacion = new Vacunacion(mascota, new Veterinario("valen", LocalDate.of(2020, 1, 1), 10), "Pfizer", 1000);
		assertEquals(1510, vacunacion.calcularCosto());
	}
}
