package ar.edu.unlp.objetos.uno.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	DateLapse datelapse;
	DateLapseWithSizeInDays dls;
	
	@BeforeEach
	void setUp() {
		datelapse = new DateLapse(LocalDate.of(2024, 03, 31), 
				LocalDate.of(2024, 10, 21));
		dls = new DateLapseWithSizeInDays(LocalDate.of(2024, 03, 31), 
				LocalDate.of(2024, 10, 21));
		
	}
	
	@Test
	void testIncludesDate() {
		assertFalse(datelapse.includesDate(LocalDate.of(2024, 03, 31)));
		assertFalse(datelapse.includesDate(LocalDate.of(2024, 10, 21)));
		assertTrue(datelapse.includesDate(LocalDate.of(2024, 10, 20)));
		assertTrue(datelapse.includesDate(LocalDate.of(2024, 04, 1)));
		assertFalse(datelapse.includesDate(LocalDate.of(2024, 03, 30)));
		assertFalse(datelapse.includesDate(LocalDate.of(2024, 10, 22)));
		
		assertFalse(dls.includesDate(LocalDate.of(2024, 03, 31)));
		assertFalse(dls.includesDate(LocalDate.of(2024, 10, 21)));
		assertTrue(dls.includesDate(LocalDate.of(2024, 10, 20)));
		assertTrue(dls.includesDate(LocalDate.of(2024, 04, 1)));
		assertFalse(dls.includesDate(LocalDate.of(2024, 03, 30)));
		assertFalse(dls.includesDate(LocalDate.of(2024, 10, 22)));
	
	}
	
}
