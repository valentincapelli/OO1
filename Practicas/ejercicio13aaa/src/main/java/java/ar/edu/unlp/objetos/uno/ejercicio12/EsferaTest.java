package ar.edu.unlp.objetos.uno.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsferaTest {
	@BeforeEach
	void setUp() {
		Esfera e = new Esfera("Metal", "Negro", 10);
	}
	
	@Test
	void testGetVolumen() {
		Esfera e = new Esfera("Metal", "Negro", 10);
		assertEquals(e.getVolumen(), (4/3) * Math.PI * Math.pow(10, 3));
	}
	
	@Test
	void testGetSuperficie() {
		Esfera e = new Esfera("Metal", "Negro", 10);
		assertEquals(e.getSuperficie(), 4 * Math.PI * Math.pow(10, 2));
	}
}
