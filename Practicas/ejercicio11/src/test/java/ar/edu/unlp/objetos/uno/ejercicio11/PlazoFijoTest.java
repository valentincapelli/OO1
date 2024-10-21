package ar.edu.unlp.objetos.uno.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
	
	@BeforeEach
	void setUp() {
		
	}
	
	@Test
	void testCalcularIntereses() {
		PlazoFijo pf = new PlazoFijo(LocalDate.of(2024, 10, 19), 1000, 10);
		assertEquals(pf.calcularIntereses(), (10 * ChronoUnit.DAYS.between(LocalDate.of(2024, 10, 19), LocalDate.now())));
		
	}
	
	@Test
	void testValorActual() {
		PlazoFijo pf = new PlazoFijo(LocalDate.of(2024, 10, 19), 1000, 10);
		assertEquals(pf.valorActual(), (1000 + (1000 * (10 * ChronoUnit.DAYS.between(LocalDate.of(2024, 10, 19), LocalDate.now())))));
	}
}
