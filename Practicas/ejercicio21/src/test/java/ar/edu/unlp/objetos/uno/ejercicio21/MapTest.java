package ar.edu.unlp.objetos.uno.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MapTest {
	 HashMap<String, Integer> map;
	
	@BeforeEach
	public void setUp() {
		map = new HashMap<>();
		map.put ("Lionel Messi", 111);
		map.put ("Gabriel Batistuta", 56);
		map.put ("Kun Agüero", 42);
	}
	
	@Test
	public void eliminarTest() {
		assertTrue(map.containsKey("Kun Agüero"));
		map.remove("Kun Agüero");
		assertFalse(map.containsKey("Kun Agüero"));
	}
	
	@Test
	public void actualizarTest() {
		assertEquals(map.get("Lionel Messi"), 111);
		map.put("Lionel Messi", 112);
		assertEquals(map.get("Lionel Messi"), 112);
	}
	
	@Test
	public void repetirClaveTest() {
		Integer previousValue = map.put("Gabriel Batistuta", 60);
		// Verificar que el valor anterior era 56 y que se ha reemplazado por 60
        assertEquals(56, previousValue);  // El valor previo asociado a "Gabriel Batistuta"
        assertEquals(60, map.get("Gabriel Batistuta"));  // Nuevo valor después de la actualización
        
        // Verificar que el tamaño del mapa sigue siendo 3, ya que solo se actualizó el valor
        assertEquals(3, map.size());
	}
	
	@Test
	public void obtenerTotalGolesTest() {
		Integer goles = map.entrySet().stream().mapToInt(map->map.getValue()).sum();
		assertEquals((111 + 56 + 42), goles);
	}
}
