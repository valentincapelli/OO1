package ar.edu.unlp.info.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PagoAlContadoTest {
	private PagoAlContado pagoAlContado;
	
	@BeforeEach
	public void setUp() {
		pagoAlContado = new PagoAlContado();
	}
	
	@Test 
	public void calcularPagoAlContadoTestCantCero() {
		assertEquals(0, pagoAlContado.calcularCosto(10, 0));
	}
	
	@Test 
	public void calcularPagoAlContadoTestCantUno() {
		assertEquals(10, pagoAlContado.calcularCosto(10, 1));
	}
	
	@Test 
	public void calcularPagoAlContadoTestCantDos() {
		assertEquals(20, pagoAlContado.calcularCosto(10, 2));
	}

}
