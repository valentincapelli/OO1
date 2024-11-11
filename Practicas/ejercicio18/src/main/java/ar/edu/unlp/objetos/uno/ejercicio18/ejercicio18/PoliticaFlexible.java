package ar.edu.unlp.objetos.uno.ejercicio18.ejercicio18;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaDeCancelacion{

	public double calcularReembolso(LocalDate inicio, double monto) {
		if (inicio.isAfter(LocalDate.now())){
			return monto;
		}
		return 0;
	}
}
