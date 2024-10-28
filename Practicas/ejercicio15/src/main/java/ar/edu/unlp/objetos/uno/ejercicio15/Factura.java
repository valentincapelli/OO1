package ar.edu.unlp.objetos.uno.ejercicio15;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private LocalDate fechaDeEmision;
	private boolean bonificacion;
	private double montoFinal;
	private static final double DESCUENTO = 0.1;
	
	public Factura(Usuario usuario, CuadroTarifario cuadro) {
		this.usuario = usuario;
		this.fechaDeEmision = LocalDate.now();
		Consumo ultConsumo = usuario.getUltimoConsumo();
		this.bonificacion = ultConsumo.hayBonificacion();
		this.montoFinal = this.getMontoFinal(ultConsumo, cuadro);
	}
	
	private double getMontoFinal(Consumo ultConsumo, CuadroTarifario cuadro) {
		if (this.bonificacion)
			return (1 - DESCUENTO) * (ultConsumo.getkWh() * cuadro.getPreciokWh());
		return (ultConsumo.getkWh() * cuadro.getPreciokWh());
	}
	
}
