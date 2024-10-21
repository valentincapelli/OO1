package ar.edu.unlp.objetos.uno.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
	ClienteDeCorreo cdc;
	Email email;
	
	@BeforeEach
	void setUp() {
		cdc = new ClienteDeCorreo();
	}
	
	@Test
	void testBuscar() {
		assertNull(cdc.buscar("Prueba"));
		Email nuevo = new Email("Prueba", "hola");
		cdc.recibir(nuevo);
		assertEquals(nuevo, cdc.buscar("Prueba"));
	}
	
	@Test
	void espacioOcupado() {
		assertEquals(0, cdc.espacioOcupado());
		cdc.recibir(new Email("Prueba", "hola"));
		assertEquals(10 ,cdc.espacioOcupado());
	}
	
}
