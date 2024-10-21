package ar.edu.unlp.objetos.uno.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrismaRectangularTest {
	@BeforeEach
	void setUp() {
		
	}
	
	@Test
	void testGetVolumen() {
		PrismaRectangular pr = new PrismaRectangular("Plastico", "Rojo", 10, 5, 15);
		assertEquals(pr.getVolumen(), (10 * 5 * 15));
	}
	
	@Test
	void testGetSuperficie() {
		PrismaRectangular pr = new PrismaRectangular("Plastico", "Rojo", 10, 5, 15);
		assertEquals(pr.getSuperficie(), 2 * ((10 * 5) + (10 * 15) + (5 * 15)));
	}
}
