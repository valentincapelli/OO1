package ar.edu.unlp.objetos.uno.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public Factura emitirFactura(CuadroTarifario ct) {
		return new Factura(this, ct);
	}
	public Consumo getUltimoConsumo() {
		return this.consumos.get(0);
	}
	public void agregarConsumo(Consumo consumo) {
		this.consumos.add(0, consumo);
	}
}
