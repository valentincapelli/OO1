package ar.edu.unlp.objetos.uno.ejercicio22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	Carpeta carpeta;
	
	@BeforeEach
	void setUp() {
		carpeta = new Carpeta();
		carpeta.setNombre("Inbox");
	}
	
	@Test
	void testEspacioOcupado() {
		assertEquals(0, carpeta.espacioOcupado());
		carpeta.agregarEmail(new Email("Prueba", "hola"));
		assertEquals(10, carpeta.espacioOcupado());
	}
	
	@Test
	void testBuscar() {
		assertNull(carpeta.buscar("Prueba"));
		Email nuevo = new Email("Prueba", "hola");
		carpeta.agregarEmail(nuevo);
		assertEquals(nuevo, carpeta.buscar("Prueba"));
	}
	
	@Test
	void testMover() {
		Carpeta carpeta2 = new Carpeta();
		Email nuevo = new Email("Prueba", "hola");
		assertFalse(carpeta2.getEmails().contains(nuevo));
		
		carpeta.agregarEmail(nuevo);
		carpeta.mover(nuevo, carpeta2);
		assertFalse(carpeta.getEmails().contains(nuevo));
		assertTrue(carpeta2.getEmails().contains(nuevo));
	}
	
	@Test
	void testCantidadEmailPorCategoria() {
		assertEquals(0, carpeta.cantidadEmailsPorCategoria().occurrencesOf("Pequeño"));
		assertEquals(0, carpeta.cantidadEmailsPorCategoria().occurrencesOf("Mediano"));
		assertEquals(0, carpeta.cantidadEmailsPorCategoria().occurrencesOf("Grande"));
	}
}
