package ar.edu.unlp.objetos.uno.ejercicio25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MascotaTest {
	private Mascota mascota;
	
	@BeforeEach
	public void setUp() {
		mascota = new Mascota("Fabio", LocalDate.of(2004, 2, 10), "Salchicha");
	}
	
	@Test
	public void altaServicioGuarderiaTest() {
		assertEquals(0, mascota.getCantServicios());
		mascota.altaServicioGuarderia(2);
		assertEquals(1, mascota.getCantServicios());
	}
	
	@Test
	public void altaConsultaTest() {
		assertEquals(0, mascota.getCantServicios());
		mascota.altaConsulta(new Veterinario("valen", LocalDate.of(2020, 1, 1), 10));
		assertEquals(1, mascota.getCantServicios());
	}
	
	@Test
	public void altaVacunacionTest() {
		assertEquals(0, mascota.getCantServicios());
		mascota.altaVacunacion(new Veterinario("valen", LocalDate.of(2020, 1, 1), 10), "Pfizer", 100);
		assertEquals(1, mascota.getCantServicios());
	}
	
	@Test
	public void tieneMasDeCincoServiciosTest() {
		assertFalse(mascota.tieneMasDeCincoServicios());
		mascota.altaVacunacion(new Veterinario("valen", LocalDate.of(2020, 1, 1), 10), "Pfizer", 100);
		mascota.altaVacunacion(new Veterinario("valen", LocalDate.of(2020, 1, 1), 10), "Pfizer", 100);
		mascota.altaServicioGuarderia(2);
		mascota.altaServicioGuarderia(2);
		assertFalse(mascota.tieneMasDeCincoServicios());
		mascota.altaServicioGuarderia(2);
		assertTrue(mascota.tieneMasDeCincoServicios());
		mascota.altaServicioGuarderia(2);
		assertTrue(mascota.tieneMasDeCincoServicios());
	}
	
	@Test
	public void calcularMontoEnFechaTest() {
		assertEquals(0, mascota.calcularMontoEnFecha(LocalDate.now()));
		mascota.altaServicioGuarderia(2);
		assertEquals(1000, mascota.calcularMontoEnFecha(LocalDate.now()));
	}
}
