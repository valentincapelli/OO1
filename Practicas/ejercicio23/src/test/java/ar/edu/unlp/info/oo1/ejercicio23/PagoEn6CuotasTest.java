package ar.edu.unlp.info.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PagoEn6CuotasTest {
	private PagoEn6Cuotas pagoEn6Cuotas;
	
	@BeforeEach
	public void setUp() {
		pagoEn6Cuotas = new PagoEn6Cuotas();
	}
	
	@Test
	public void calcularPagoEn6CuotasCantCero() {
		assertEquals(0 ,pagoEn6Cuotas.calcularCosto(10, 0));
	}
	
	@Test
	public void calcularPagoEn6CuotasCantUno() {
		assertEquals(12 ,pagoEn6Cuotas.calcularCosto(10, 1));
	}
	
	
}
