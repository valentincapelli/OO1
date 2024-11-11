package ar.edu.unlp.objetos.uno.ejercicio18.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaDeCancelacion{

	public double calcularReembolso(LocalDate inicio, double monto) {
		if (ChronoUnit.DAYS.between(LocalDate.now(), inicio) >= 7) {
			return monto;
		} else if (ChronoUnit.DAYS.between(LocalDate.now(), inicio) >= 2)
			return monto * 0.5;
		else
			return 0;
	}
}
