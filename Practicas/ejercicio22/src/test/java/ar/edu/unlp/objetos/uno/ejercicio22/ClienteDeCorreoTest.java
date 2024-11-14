package ar.edu.unlp.objetos.uno.ejercicio22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
	void testEspacioOcupado() {
		assertEquals(0, cdc.espacioOcupado());
		cdc.recibir(new Email("Prueba", "hola"));
		assertEquals(10 ,cdc.espacioOcupado());
	}
	
	@Test // CONSULTAR, NO ANDA
	void testCantidadTotalEmails() {
		ClienteDeCorreo cdc = new ClienteDeCorreo();
	    assertEquals(0, cdc.cantidadTotalEmails());  // Verifica que inicialmente no haya emails

	    List<Email> emails = new LinkedList<>();
	    emails.add(new Email("prueba1", "prueba1"));
	    emails.add(new Email("prueba2", "prueba1"));

	    Carpeta carpeta = new Carpeta("carpeta1", emails);
	    cdc.agregarCarpeta(carpeta);  // Agrega la carpeta con 2 emails

	    cdc.recibir(new Email("prueba3", "prueba1"));  // Agrega un email al inbox

	    // Ahora debería haber 3 emails en total
	    assertEquals(3, cdc.cantidadTotalEmails());
		
	}
}
