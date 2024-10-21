package ar.edu.unlp.objetos.uno.ejercicio11;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	
	@BeforeEach
	void setUp() {
		Inversor inversor = new Inversor();
		inversor.setNombre("Valentin");
		inversor.agregarInversion(new PlazoFijo(LocalDate.now(), 1000, 10));
	}
	
	@Test
	void testAgregarInversion() {
		Inversor inversor = new Inversor();
		inversor.setNombre("Valentin");
		assertTrue(inversor.getInversiones().isEmpty());
		inversor.agregarInversion(new PlazoFijo(LocalDate.now(), 1000, 10));
		assertFalse(inversor.getInversiones().isEmpty());
	}
	
	@Test
	void valorActualCon0Intereses() {
		Inversor inversor = new Inversor();
		inversor.setNombre("Valentin");
		assertTrue(inversor.valorActual() == 0);
		inversor.agregarInversion(new PlazoFijo(LocalDate.now(), 1000, 0));
		assertTrue(inversor.valorActual() == 1000);
	}
	
	@Test
	void valorActualConIntereses() {
		Inversor inversor = new Inversor();
		inversor.setNombre("Valentin");
		assertTrue(inversor.valorActual() == 0);
		inversor.agregarInversion(new PlazoFijo(LocalDate.of(2024, 10, 19), 1000, 10));
		assertTrue(inversor.valorActual() == (1000 + (1000 * (10 * ChronoUnit.DAYS.between(LocalDate.of(2024, 10, 19), LocalDate.now())))));
	}
	
}
