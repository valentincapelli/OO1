package ar.edu.unlp.objetos.uno.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionEnAccionesTest {

	@BeforeEach
	void setUp() {
		
	}
	
	@Test
	void testValorActual() {
		InversionEnAcciones iea = new InversionEnAcciones("Apple", 100, 50);
		assertEquals(iea.valorActual(), (100 * 50));
	}
}
