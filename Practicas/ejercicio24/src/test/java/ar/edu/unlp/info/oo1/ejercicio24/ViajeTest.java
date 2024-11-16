package ar.edu.unlp.info.oo1.ejercicio24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ViajeTest {
	private Viaje viaje1;
	private Viaje viaje2;
	private Viaje viaje3;
	private Vehiculo auto;
	private Conductor charles;
	
	@BeforeEach
	public void setUp() {
		auto = new Vehiculo("Vehiculo de prueba", 3, 2019, 100000, charles);
        charles = new Conductor("Conductor de prueba", 1000, auto);
	}
	
	@Test
	public void hayCapacidadTest() {
		viaje3 = new Viaje("Brandsen", "La Plata", 2800, LocalDate.now().plusDays(3), auto);
		assertTrue(viaje3.hayCapacidad());
		
		Pasajero cape = new Pasajero("Cape", 10);
		Pasajero fabio = new Pasajero("Fabio", 10);
		
		viaje3.registrarViaje(cape);
		
		assertTrue(viaje3.hayCapacidad());
		
		viaje3.registrarViaje(fabio);
	
		assertFalse(viaje3.hayCapacidad());
	}
	
	@Test
	public void registrarViajeTestDias() {
		viaje1 = new Viaje("Brandsen", "La Plata", 2800, LocalDate.now().plusDays(1), auto);
		viaje2 = new Viaje("Brandsen", "La Plata", 2800, LocalDate.now().plusDays(2), auto);
		viaje3 = new Viaje("Brandsen", "La Plata", 2800, LocalDate.now().plusDays(3), auto);
		Pasajero fabio = new Pasajero("Fabio", 1000);
		assertEquals(0, fabio.cantidadViajes());
		
		viaje1.registrarViaje(fabio);
		assertEquals(0, fabio.cantidadViajes());
		
		viaje2.registrarViaje(fabio);
		assertEquals(0, fabio.cantidadViajes());
		
		viaje3.registrarViaje(fabio);
		assertEquals(1, fabio.cantidadViajes());
		
	}
	
	@Test
	public void registrarViajeTestSaldo() {
		Pasajero fabio = new Pasajero("Fabio", 10);
		assertEquals(0, fabio.cantidadViajes());
		viaje3 = new Viaje("Brandsen", "La Plata", 2800, LocalDate.now().plusDays(3), auto);
		viaje3.registrarViaje(fabio);
		assertEquals(1, fabio.cantidadViajes());
		
		Pasajero valen = new Pasajero("Valen", 0);
		assertEquals(0, valen.cantidadViajes());
		viaje3 = new Viaje("Brandsen", "La Plata", 2800, LocalDate.now().plusDays(3), auto);
		viaje3.registrarViaje(valen);
		assertEquals(0, valen.cantidadViajes());
		
		Pasajero cape = new Pasajero("Cape", -1);
		assertEquals(0, cape.cantidadViajes());
		viaje3 = new Viaje("Brandsen", "La Plata", 2800, LocalDate.now().plusDays(3), auto);
		viaje3.registrarViaje(cape);
		assertEquals(0, cape.cantidadViajes());
	}
	
	@Test
	public void registrarViajeTestCapacidad() {
		viaje3 = new Viaje("Brandsen", "La Plata", 2800, LocalDate.now().plusDays(3), auto);
		assertEquals(1, viaje3.cantidadPasajeros());
		
		Pasajero cape = new Pasajero("Cape", 10);
		Pasajero fabio = new Pasajero("Fabio", 10);
		Pasajero valen = new Pasajero("Valen", 10);
		
		viaje3.registrarViaje(cape);
		assertEquals(2, viaje3.cantidadPasajeros());
	
		viaje3.registrarViaje(fabio);
		assertEquals(3, viaje3.cantidadPasajeros());
	
		viaje3.registrarViaje(valen);
		assertEquals(3, viaje3.cantidadPasajeros());
	}
	
	@Test
	public void procesarViajeTest() {
		viaje3 = new Viaje("Brandsen", "La Plata", 60, LocalDate.now().plusDays(3), auto);
		Pasajero cape = new Pasajero("Cape", 10);
		Pasajero fabio = new Pasajero("Fabio", 10);
		
		viaje3.registrarViaje(cape);
		viaje3.registrarViaje(fabio);
		
		assertEquals(10, cape.getSaldo());
		assertEquals(10, fabio.getSaldo());
		assertEquals(1000, charles.getSaldo());
		
		viaje3.procesarViaje();
		
		assertEquals(-10, cape.getSaldo());
		assertEquals(-10, fabio.getSaldo());
		assertEquals(980, charles.getSaldo());
	}
}
