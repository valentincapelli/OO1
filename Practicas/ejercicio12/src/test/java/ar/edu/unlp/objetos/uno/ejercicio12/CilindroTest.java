package ar.edu.unlp.objetos.uno.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {

	@BeforeEach
	void setUp() {
		
	}
	
	@Test
	void getVolumen() {
		Cilindro c = new Cilindro("Madera", "Verde", 10, 20);
		assertEquals(c.getVolumen(), (Math.PI * Math.pow(10, 2) * 20));
	}
	
	@Test
	void getSuperficie() {
		Cilindro c = new Cilindro("Madera", "Verde", 10, 20);
		assertEquals(c.getSuperficie(), (2 * Math.PI * 10 * 20) + (2 * Math.PI * Math.pow(10, 2)));
	}
}
