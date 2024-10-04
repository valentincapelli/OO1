package ar.edu.unlp.objetos.uno.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cc;
	private CajaDeAhorro ca = new CajaDeAhorro();
	
	@BeforeEach
	void setUp() throws Exception {
		this.cc = new CuentaCorriente();
		this.cc.depositar(100);
	}
	
	@Test
	void testPuedeExtraer() {
		assertTrue(cc.puedeExtraer(30));
	}
	
	@Test
	void testExtraerSinControlar() {
		this.cc.extraerSinControlar(50);
		assertEquals(100, this.cc.getSaldo());
	}
	
	@Test
	void testExtraer() {
		assertFalse(this.cc.extraer(101));
	}
	
	@Test 
	void testTransferir () {
		assertTrue(this.cc.transferirACuenta(90, ca));
	}
	
}
