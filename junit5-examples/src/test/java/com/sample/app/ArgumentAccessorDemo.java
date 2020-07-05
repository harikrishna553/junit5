package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import com.sample.app.model.Gender;
import com.sample.app.model.Person;

public class ArgumentAccessorDemo {
	
	@ParameterizedTest
	@CsvSource({ 
				"Sailu, PTR, FEMALE, 1989-08-20", 
				"Ram, Gurram, MALE, 1990-01-22"
			})
	void testWithArgumentsAccessor(ArgumentsAccessor arguments) {
		Person person = new Person(arguments.getString(0), arguments.getString(1), arguments.get(2, Gender.class),
				arguments.get(3, LocalDate.class));

		if (person.getFirstName().equals("Sailu")) {
			assertEquals(Gender.FEMALE, person.getGender());
			assertEquals("PTR", person.getLastName());
			assertEquals(1989, person.getDateOfBirth().getYear());
		} else {
			assertEquals(Gender.MALE, person.getGender());
			assertEquals("Ram", person.getFirstName());
			assertEquals("Gurram", person.getLastName());
			assertEquals(1990, person.getDateOfBirth().getYear());
		}

	}
	
}