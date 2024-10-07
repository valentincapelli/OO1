package ar.edu.unlp.objetos.uno.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro ca;
	private CajaDeAhorro ca2;
	
	@BeforeEach
	void setUp() throws Exception {
		this.ca = new CajaDeAhorro();
		this.ca.setSaldo(100);
	}
	
	@Test
	void testPuedeExtraer () {
		double saldo = this.ca.getSaldo();
		assertTrue(ca.puedeExtraer(30));
		assertEquals(saldo, this.ca.getSaldo());
	}
	
	@Test
	void testExtraerSinControlar() {
		this.ca.extraerSinControlar(50);
		assertEquals(50 * 0.98, this.ca.getSaldo());
	}
	
	
	@Test
	void testExtraer() {
		assertTrue(this.ca.extraer(90));
		assertEquals((100 - (90 * 1.02)), this.ca.getSaldo());
	}
	
	@Test
	void testTransferir() {
		ca2 = new CajaDeAhorro();
		assertEquals(100, this.ca.getSaldo());
		this.ca.transferirACuenta(10, ca2);
		assertEquals(100 - (10 * 1.02), this.ca.getSaldo());
	}
	
}
