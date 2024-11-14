package ar.edu.unlp.objetos.uno.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class JugadorTest {
	
	HashMap<Jugador, Integer> map;
	Jugador messi;
	Jugador bati;
	Jugador kun;
	
	@BeforeEach
	public void setUp() {
		map = new HashMap<>();
		messi = new Jugador ("Lionel", "Messi");
		map.put (messi, 111);
		bati = new Jugador ("Gabriel", "Batistuta");
		map.put (bati, 56);
		kun = new Jugador ("Kun", "Agüero");
		map.put (kun, 42);
	}
	
	@Test
	public void eliminarTest() {
		assertTrue(map.containsKey(kun));
		map.remove(kun);
		assertFalse(map.containsKey(kun));
	}
	
	@Test
	public void actualizarTest() {
		assertEquals(map.get(messi), 111);
		map.put(messi, 112);
		assertEquals(map.get(messi), 112);
	}
	
	@Test
	public void repetirClaveTest() {
		Integer previousValue = map.put(bati, 60);
		// Verificar que el valor anterior era 56 y que se ha reemplazado por 60
        assertEquals(56, previousValue);  // El valor previo asociado a "Gabriel Batistuta"
        assertEquals(60, map.get(bati));  // Nuevo valor después de la actualización
        
        // Verificar que el tamaño del mapa sigue siendo 3, ya que solo se actualizó el valor
        assertEquals(3, map.size());
	}
	
	@Test
	public void obtenerTotalGolesTest() {
		Integer goles = map.entrySet().stream().mapToInt(map->map.getValue()).sum();
		assertEquals((111 + 56 + 42), goles);
	}
}
