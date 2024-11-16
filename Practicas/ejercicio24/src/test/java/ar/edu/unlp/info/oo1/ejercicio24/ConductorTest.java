package ar.edu.unlp.info.oo1.ejercicio24;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConductorTest {
    private Conductor conductor;
    private Conductor leclerc;

    @BeforeEach
    public void setUp() {
        Vehiculo vehiculo = new Vehiculo("Vehiculo de prueba", 4, 2019, 100000, conductor);
        conductor = new Conductor("Conductor de prueba", 1000, vehiculo);
        
        Vehiculo ferrari = new Vehiculo("Vehiculo de prueba", 4, 2023, 100000, leclerc);
        leclerc = new Conductor("Conductor de prueba", 1000, ferrari);
    }

    @Test
    public void testCargarSaldoMasDeCincoAniosTest() {
        assertEquals(1000, conductor.getSaldo());
        conductor.cargarSaldo(1000);
        assertEquals(1900, conductor.getSaldo());
    }
    
    @Test
    public void testCargarSaldoMenosDeCincoAniosTest() {
        assertEquals(1000, leclerc.getSaldo());
        leclerc.cargarSaldo(1000);
        assertEquals(1990 , leclerc.getSaldo());
    }
    
    @Test 
    public void descontarSaldoTest() {
    	assertEquals(1000, leclerc.getSaldo());
    	leclerc.descontarSaldo(100);
    	assertEquals(1900, leclerc.getSaldo());
    }
}
