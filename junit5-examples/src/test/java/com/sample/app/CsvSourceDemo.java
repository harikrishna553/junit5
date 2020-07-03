package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.sample.app.util.EmployeeUtil;

public class CsvSourceDemo {
	@ParameterizedTest
	@CsvSource({
	    "1, Krishna, Gurram",
	    "2, Gopi, Battu",
	    "3, Ram, Ponnam"
	})
	void testWithCsvSource_1(int id, String firstName, String lastName) {
		Employee emp = new Employee(id, firstName, lastName);
		
		String expected = emp.getId()+","+emp.getFirstName()+","+emp.getLastName();
		String actual = EmployeeUtil.getEmployeeAsString(emp);
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@CsvSource(value = {
	    "1: Krishna: Gurram",
	    "2: Gopi: Battu",
	    "3: Ram: Ponnam"
	}, delimiterString=":")
	void testWithCsvSource_2(int id, String firstName, String lastName) {
		Employee emp = new Employee(id, firstName, lastName);
		
		String expected = emp.getId()+","+emp.getFirstName()+","+emp.getLastName();
		String actual = EmployeeUtil.getEmployeeAsString(emp);
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@CsvSource({
	    "1, 'Krishna, Govind', Gurram",
	    "2, 'Gopi, krishna', Battu",
	    "3, Ram, Ponnam"
	})
	void testWithCsvSource_3(int id, String firstName, String lastName) {
		Employee emp = new Employee(id, firstName, lastName);
		
		String expected = emp.getId()+","+emp.getFirstName()+","+emp.getLastName();
		String actual = EmployeeUtil.getEmployeeAsString(emp);
		
		assertEquals(expected, actual);
	}	
	
}