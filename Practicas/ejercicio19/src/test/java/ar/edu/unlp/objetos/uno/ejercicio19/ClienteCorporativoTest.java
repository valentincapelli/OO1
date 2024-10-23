package ar.edu.unlp.objetos.uno.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteCorporativoTest {
	ClienteCorporativo cp;

	@BeforeEach
	void setUp() {
		cp = new ClienteCorporativo("Fabiogay", "La plata", "1234");
	}
	
	@Test
	void testCalcularCosto() {
		cp.agregarEnvio(new EnvioLocal(LocalDate.of(2024, 03, 31), "Brandsen", "La Plata", 100, true));
		assertEquals(1500, cp.montoAPagar(LocalDate.of(2024, 03, 30), LocalDate.of(2024, 04, 1)));
		cp.agregarEnvio(new EnvioLocal(LocalDate.of(2024, 03, 31), "Brandsen", "La Plata", 100, true));
		cp.agregarEnvio(new EnvioLocal(LocalDate.of(2024, 03, 30), "Brandsen", "La Plata", 100, true));
		cp.agregarEnvio(new EnvioLocal(LocalDate.of(2024, 04, 01), "Brandsen", "La Plata", 100, true));
		assertEquals(3000, cp.montoAPagar(LocalDate.of(2024, 03, 30), LocalDate.of(2024, 04, 1)));
	}
}
