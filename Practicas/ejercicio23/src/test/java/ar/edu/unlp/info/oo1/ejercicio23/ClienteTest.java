package ar.edu.unlp.info.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	private Cliente cape;
	private Producto heladera;
	private Producto celular;
	private Producto procesador;
	private Producto memoriaRam;
	
	@BeforeEach
	public void setUp() {
		cape = new Cliente("CAPE", "durañona XD");
		heladera = new Producto("Heladera", "Electrodomestico", 500, 20, new Vendedor("Mamu", "Ferrari 505"));
		celular = new Producto("Iphone 16 pro max", "Telefono", 250, 35, new Vendedor("Fabio", "Pedro Hita 777"));
		procesador = new Producto("Ryzen 5 2600", "Electronica", 250, 50, new Vendedor("Valen", "8 y 44"));
		memoriaRam = new Producto("Hyperx 8GB", "Electronica", 100, 50, new Vendedor("Cape", "Durañona 666"));
	}
	
	@Test
	public void conocerCantidadPorCategoriaTest() {
		assertEquals(0, cape.conocerCantidadPorCategoria().occurrencesOf("Mueble"));
		heladera.generarPedido(cape, new PagoAlContado(), new RetirarEnComercio(), 1);
		assertEquals(1, cape.conocerCantidadPorCategoria().occurrencesOf("Electrodomestico"));
		celular.generarPedido(cape, new PagoAlContado(), new RetirarEnComercio(), 1);
		celular.generarPedido(cape, new PagoAlContado(), new RetirarEnComercio(), 1);
		assertEquals(2, cape.conocerCantidadPorCategoria().occurrencesOf("Telefono"));
	}
}