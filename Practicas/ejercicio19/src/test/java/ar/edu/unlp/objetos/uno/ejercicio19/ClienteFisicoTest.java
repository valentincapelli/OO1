package ar.edu.unlp.objetos.uno.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteFisicoTest {
	ClienteFisico cf;

	@BeforeEach
	void setUp() {
		cf = new ClienteFisico("Fabiogay", "La plata", "1234");
	}
	
	@Test
	void testCalcularCosto() {
		cf.agregarEnvio(new EnvioLocal(LocalDate.of(2024, 03, 31), "Brandsen", "La Plata", 100, true));
		assertEquals(1500 * 0.90, cf.montoAPagar(LocalDate.of(2024, 03, 30), LocalDate.of(2024, 04, 1)));
		cf.agregarEnvio(new EnvioLocal(LocalDate.of(2024, 03, 31), "Brandsen", "La Plata", 100, true));
		cf.agregarEnvio(new EnvioLocal(LocalDate.of(2024, 03, 30), "Brandsen", "La Plata", 100, true));
		cf.agregarEnvio(new EnvioLocal(LocalDate.of(2024, 04, 01), "Brandsen", "La Plata", 100, true));
		assertEquals(3000 * 0.90, cf.montoAPagar(LocalDate.of(2024, 03, 30), LocalDate.of(2024, 04, 1)));
	}
}
