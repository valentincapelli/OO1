package ar.edu.unlp.objetos.uno.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioInternacionalTest {
	private EnvioInternacional envio;
	
	@BeforeEach
	void setUp() {
		
	}
	
	@Test
	void testCalcularCosto() {
		envio = new EnvioInternacional(LocalDate.of(2024, 03, 31), "La Plata", "Brandsen", 999, "Bolivia");
		assertEquals((5000 + (10 * envio.getPesoEnGramos())), envio.calcularCosto());
		envio = new EnvioInternacional(LocalDate.of(2024, 03, 31), "La Plata", "Brandsen", 1000, "Bolivia");
		assertEquals(15000, envio.calcularCosto());
		envio = new EnvioInternacional(LocalDate.of(2024, 03, 31), "La Plata", "Brandsen", 1001, "Bolivia");
		assertEquals((5000 + (12 * envio.getPesoEnGramos())), envio.calcularCosto());
	}
}
