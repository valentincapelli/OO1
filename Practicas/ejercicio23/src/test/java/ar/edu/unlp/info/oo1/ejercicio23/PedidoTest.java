package ar.edu.unlp.info.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
	private Pedido pedido;
	
	@BeforeEach
	public void setUp() {
		Cliente cliente = new Cliente("Fabio", "Tu vieja");
		Producto producto = new Producto("Heladera", "Electrodomestico", 500, 5, new Vendedor("FORRO", "LA CONCHA DE TU MADRE"));
		FormaDePago enSeisCuotas = new PagoEn6Cuotas();
		FormaDeEnvio enComercio = new RetirarEnComercio();
		pedido = new Pedido(cliente, producto, enSeisCuotas, enComercio, 2);
	}
	
	@Test
	public void calcularCostoTotalUno() {
		assertEquals(1200, pedido.calcularCostoTotal());	
	}
	
	@Test
	public void calcularCostoTotalDos() {
		Cliente cliente = new Cliente("Fabio", "Tu vieja");
		Producto producto = new Producto("Heladera", "Electrodomestico", 500, 5, new Vendedor("FORRO", "LA CONCHA DE TU MADRE"));
		FormaDePago enSeisCuotas = new PagoEn6Cuotas();
		FormaDeEnvio enSucursal = new RetirarEnSucursal();
		pedido = new Pedido(cliente, producto, enSeisCuotas, enSucursal, 2);
		assertEquals(4200, pedido.calcularCostoTotal());	
	}
	
	@Test
	public void calcularCostoTotalTres() {
		Cliente cliente = new Cliente("Fabio", "Tu vieja");
		Producto producto = new Producto("Heladera", "Electrodomestico", 500, 5, new Vendedor("FORRO", "LA CONCHA DE TU MADRE"));
		FormaDePago enSeisCuotas = new PagoEn6Cuotas();
		FormaDeEnvio aDomicilio = new ExpressADomicilio();
		pedido = new Pedido(cliente, producto, enSeisCuotas, aDomicilio, 2);
		assertEquals(1250, pedido.calcularCostoTotal());	
	}
	
	@Test
	public void calcularCostoTotalCuatro() {
		Cliente cliente = new Cliente("Fabio", "Tu vieja");
		Producto producto = new Producto("Heladera", "Electrodomestico", 500, 5, new Vendedor("FORRO", "LA CONCHA DE TU MADRE"));
		FormaDePago alContado = new PagoAlContado();
		FormaDeEnvio aDomicilio = new ExpressADomicilio();
		pedido = new Pedido(cliente, producto, alContado, aDomicilio, 2);
		assertEquals(1050, pedido.calcularCostoTotal());	
	}
	
	@Test
	public void calcularCostoTotalCinco() {
		Cliente cliente = new Cliente("Fabio", "Tu vieja");
		Producto producto = new Producto("Heladera", "Electrodomestico", 500, 5, new Vendedor("FORRO", "LA CONCHA DE TU MADRE"));
		FormaDePago alContado = new PagoAlContado();
		FormaDeEnvio enSucursal = new RetirarEnSucursal();
		pedido = new Pedido(cliente, producto, alContado, enSucursal, 2);
		assertEquals(4000, pedido.calcularCostoTotal());	
	}
	
	@Test
	public void calcularCostoTotalSeis() {
		Cliente cliente = new Cliente("Fabio", "Tu vieja");
		Producto producto = new Producto("Heladera", "Electrodomestico", 500, 5, new Vendedor("FORRO", "LA CONCHA DE TU MADRE"));
		FormaDePago alContado = new PagoAlContado();
		FormaDeEnvio enComercio = new RetirarEnComercio();
		pedido = new Pedido(cliente, producto, alContado, enComercio, 2);
		assertEquals(1000, pedido.calcularCostoTotal());	
	}
}
