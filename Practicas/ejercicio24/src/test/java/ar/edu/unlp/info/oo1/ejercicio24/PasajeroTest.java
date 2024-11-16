package ar.edu.unlp.info.oo1.ejercicio24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasajeroTest {
	private Pasajero pasajero;
	private Conductor leclerc;
	
	@BeforeEach
	public void setUp() {
		Vehiculo ferrari = new Vehiculo("Vehiculo de prueba", 4, 2023, 100000, leclerc);
        leclerc = new Conductor("Conductor de prueba", 1000, ferrari);
        
		this.pasajero = new Pasajero("Cape", 100);
	}
	
	@Test
	public void DebeCobrarComisionNOTest() {
		assertTrue(pasajero.debeCobrarComision());
		
		Vehiculo ferrari = new Vehiculo("Vehiculo de prueba", 4, 2023, 100000, leclerc);
        leclerc = new Conductor("Conductor de prueba", 1000, ferrari);
		
		this.pasajero.agregarViaje(new Viaje("Brandsen", "La Plata", 2800, LocalDate.of(2024, 11, 10), ferrari));
		
		assertFalse(pasajero.debeCobrarComision());
	}
	
	@Test
	public void DebeCobrarComisionSiTest() {
		assertTrue(pasajero.debeCobrarComision());
		
		Vehiculo ferrari = new Vehiculo("Vehiculo de prueba", 4, 2023, 100000, leclerc);
        leclerc = new Conductor("Conductor de prueba", 1000, ferrari);
		
		this.pasajero.agregarViaje(new Viaje("Brandsen", "La Plata", 2800, LocalDate.of(2024, 10, 16), ferrari));
		
		assertTrue(pasajero.debeCobrarComision());
	}
	
	@Test
	public void cargarSaldoTest() {
		assertEquals(100, this.pasajero.getSaldo());
		this.pasajero.cargarSaldo(100);
		assertEquals(190, this.pasajero.getSaldo());
		
		Vehiculo ferrari = new Vehiculo("Vehiculo de prueba", 4, 2023, 100000, leclerc);
        leclerc = new Conductor("Conductor de prueba", 1000, ferrari);
		this.pasajero.agregarViaje(new Viaje("Brandsen", "La Plata", 2800, LocalDate.of(2024, 11, 10), ferrari));
		this.pasajero.cargarSaldo(100);
		assertEquals(290, this.pasajero.getSaldo());
	}
	
	@Test
	public void descontarSaldoTest() {
		assertEquals(100, this.pasajero.getSaldo());
		this.pasajero.descontarSaldo(500);
		assertEquals(-400, this.pasajero.getSaldo());
		
		Vehiculo ferrari = new Vehiculo("Vehiculo de prueba", 4, 2023, 100000, leclerc);
        leclerc = new Conductor("Conductor de prueba", 1000, ferrari);
		this.pasajero.agregarViaje(new Viaje("Brandsen", "La Plata", 2800, LocalDate.of(2024, 11, 10), ferrari));
		
		this.pasajero.descontarSaldo(0);
		assertEquals(100, this.pasajero.getSaldo());
		this.pasajero.descontarSaldo(100);
		assertEquals(500, this.pasajero.getSaldo());
	}
}