package ar.edu.unlp.objetos.uno.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	Email email;
	
	@BeforeEach
	void setUp() {
		email = new Email("Titulo", "Cuerpo");
	}
	
	@Test
	void testBuscar() {
		assertFalse(email.buscar("Esto no esta en el email"));
		email.setCuerpo("Esto si esta en el email.");
		assertTrue(email.buscar("Esto si esta en el email."));
	}
	
	@Test
	void testTamaño() {
		assertFalse(10 == email.tamaño());
		email.setCuerpo("hola");
		assertEquals(10, email.tamaño());
	}
}
