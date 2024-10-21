package ar.edu.unlp.objetos.uno.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.objetos.uno.ejercicio12.Cilindro;
import ar.edu.unlp.objetos.uno.ejercicio12.ReporteDeConstruccionTest;

public class ReporteDeConstruccionTest {

	@BeforeEach
	void setUp() {
		
	}
	
	@Test
	void testAgregarPieza() {
		ReporteDeConstruccion rdc = new ReporteDeConstruccion();
		assertTrue(rdc.getPiezas().isEmpty());
		rdc.agregarPieza(new Cilindro());
		assertFalse(rdc.getPiezas().isEmpty());

	}
}
