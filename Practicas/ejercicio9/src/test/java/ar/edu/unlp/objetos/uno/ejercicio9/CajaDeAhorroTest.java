package ar.edu.unlp.objetos.uno.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro ca;
	private CuentaCorriente cc = new CuentaCorriente();
	
	@BeforeEach
	void setUp() throws Exception {
		this.ca = new CajaDeAhorro();
		this.ca.depositar(100);
	}
	
	@Test
	void testPuedeExtraer () {
		assertTrue(cc.puedeExtraer(30));
	}
	
	@Test
	void testExtraerSinControlar() {
		this.ca.extraerSinControlar(50);
		assertEquals(100, this.ca.getSaldo());
	}
	
	@Test
	void testExtraer() {
		assertTrue(this.ca.extraer(90));
		assertEquals(10, this.ca.getSaldo());
	}
	
	@Test
	void testTransferir() {
		assertFalse(this.ca.transferirACuenta(10, cc));
	}
	
}
