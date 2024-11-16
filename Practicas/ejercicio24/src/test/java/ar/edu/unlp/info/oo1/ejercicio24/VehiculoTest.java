package ar.edu.unlp.info.oo1.ejercicio24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehiculoTest {
	private Vehiculo ferrari2020;
	private Vehiculo ferrari2019;
	private Vehiculo ferrari2018;
	private Conductor leclerc;
	private Conductor sainz;
	private Conductor alonso;
	
	@BeforeEach
	public void setUp() {
		ferrari2020 = new Vehiculo("Vehiculo de prueba", 4, 2020, 100000, leclerc);
        leclerc = new Conductor("Conductor de prueba", 1000, ferrari2020);
        
        ferrari2019 = new Vehiculo("Vehiculo de prueba", 4, 2019, 100000, alonso);
        alonso = new Conductor("Conductor de prueba", 1000, ferrari2019);
        
        ferrari2018 = new Vehiculo("Vehiculo de prueba", 4, 2018, 10000, sainz);
        sainz = new Conductor("Conductor de prueba", 1000, ferrari2018);
	}
	
	@Test
	public void tieneMenosDeCincoAniosTest() {
		assertTrue(ferrari2020.tieneMenosDeCincoAnios());
		assertFalse(ferrari2019.tieneMenosDeCincoAnios());
		assertFalse(ferrari2018.tieneMenosDeCincoAnios());
	}
	
	@Test
	public void getBonificacionTest() {
		assertEquals(1000, ferrari2020.getBonificacion());
	}
}
