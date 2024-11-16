package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
	    return (int) from.until(to, ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
        return (other.isEqual(from) || other.isAfter(from)) && (other.isEqual(to) || other.isBefore(to));
    }
}
