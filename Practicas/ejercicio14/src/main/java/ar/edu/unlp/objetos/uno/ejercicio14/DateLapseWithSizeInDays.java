package ar.edu.unlp.objetos.uno.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseWithSizeInDays implements DateLapseInterface{
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseWithSizeInDays(LocalDate from, LocalDate to) {
		this.from = from;
		this.sizeInDays = (int) from.until(to, ChronoUnit.DAYS);
	}
	
	@Override
	public boolean includesDate(LocalDate other) {
		// Calculamos la fecha de finalización sumando sizeInDays a la fecha from
	    LocalDate endDate = from.plusDays(sizeInDays);
	    
	    // Verificamos si 'other' está dentro del rango [from, endDate)
	    return (other.isAfter(from) && other.isBefore(endDate));
	}
	
}
