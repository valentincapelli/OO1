package ar.edu.unlp.objetos.uno.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioLocalTest {
	private EnvioLocal elRapido;
	private EnvioLocal elStandard;
	
	@BeforeEach
	void setUp() {
		elRapido = new EnvioLocal(LocalDate.of(2024, 03, 31), "La Plata", "Brandsen", 500, true);
		elStandard = new EnvioLocal(LocalDate.of(2024, 03, 31), "La Plata", "Brandsen", 1500, false);
	}
	
	@Test
	void testCalcularCosto() {
		assertEquals(1500, elRapido.calcularCosto());
		assertEquals(1000, elStandard.calcularCosto());
	}
}
