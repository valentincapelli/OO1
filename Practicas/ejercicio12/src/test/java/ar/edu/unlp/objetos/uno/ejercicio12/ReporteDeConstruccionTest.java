package ar.edu.unlp.objetos.uno.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.objetos.uno.ejercicio12.Cilindro;
import ar.edu.unlp.objetos.uno.ejercicio12.ReporteDeConstruccionTest;

public class ReporteDeConstruccionTest {
	ReporteDeConstruccion rdc, rdcVacio;
	
	@BeforeEach
	void setUp() {
		rdcVacio = new ReporteDeConstruccion();
		rdc = new ReporteDeConstruccion();
		rdc.agregarPieza(new Cilindro("Madera", "Verde", 10, 20));
		rdc.agregarPieza(new Cilindro("Hierro", "Verde", 10, 20));
		rdc.agregarPieza(new Cilindro("Hierro", "Rojo", 10, 20));
		rdc.agregarPieza(new Esfera("Papel", "Rojo", 10));
		rdc.agregarPieza(new PrismaRectangular("Hierro", "Azul", 10, 20, 5));
	}
	
	@Test
	void testAgregarPieza() {
		assertTrue(rdcVacio.getPiezas().isEmpty());
		Cilindro nuevo = new Cilindro();
		rdcVacio.agregarPieza(nuevo);
		assertFalse(rdcVacio.getPiezas().isEmpty());
		assertTrue(rdcVacio.getPiezas().contains(nuevo));
	}
	
	@Test
	void testVolumenDeMaterial() {
		assertEquals(0, rdcVacio.volumenDeMaterial("Madera"));
		assertEquals(Math.PI * Math.pow(10, 2) * 20, rdc.volumenDeMaterial("Madera"));
		assertEquals(0, rdc.volumenDeMaterial("Aluminio"));

	}
	
	@Test
	void testSuperficieDeMaterial() {
		assertEquals(0, rdcVacio.superficieDeColor("Verde"));
		assertEquals(2*( (2 * Math.PI * 10 * 20) + (2 * Math.PI * Math.pow(10, 2))), rdc.superficieDeColor("Verde"));
		assertEquals(0, rdc.superficieDeColor("Rosa"));
	}
	
}
