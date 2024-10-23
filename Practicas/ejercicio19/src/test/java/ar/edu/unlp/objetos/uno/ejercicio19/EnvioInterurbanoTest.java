package ar.edu.unlp.objetos.uno.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioInterurbanoTest {
	private EnvioInterurbano envio;
	
	@BeforeEach
	void setUp() {

	}
	
	@Test
	void testCalcularCostoDistancia100() {
		envio = new EnvioInterurbano(LocalDate.of(2024, 03, 31), "La Plata", "Brandsen", 100, 99);
		assertEquals(2000, envio.calcularCosto());
		envio.setDistanciaEnKm(100);
		assertEquals(2500, envio.calcularCosto());
		envio.setDistanciaEnKm(101);
		assertEquals(2500, envio.calcularCosto());
	}
	
	@Test
	void testCalcularCostoDistancia500() {
		envio = new EnvioInterurbano(LocalDate.of(2024, 03, 31), "La Plata", "Brandsen", 100, 499);
		assertEquals(2500, envio.calcularCosto());
		envio = new EnvioInterurbano(LocalDate.of(2024, 03, 31), "La Plata", "Brandsen", 100, 500);
		assertEquals(2500, envio.calcularCosto());
		envio = new EnvioInterurbano(LocalDate.of(2024, 03, 31), "La Plata", "Brandsen", 100, 501);
		assertEquals(3000, envio.calcularCosto());
	}
	
}
