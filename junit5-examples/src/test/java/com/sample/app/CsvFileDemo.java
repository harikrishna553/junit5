package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.sample.app.util.EmployeeUtil;

public class CsvFileDemo {
	@ParameterizedTest
	@CsvFileSource(resources = "/employeeInfo.csv")
	void testWithCsvSource_1(int id, String firstName, String lastName) {
		Employee emp = new Employee(id, firstName, lastName);
		
		String expected = emp.getId()+","+emp.getFirstName()+","+emp.getLastName();
		String actual = EmployeeUtil.getEmployeeAsString(emp);
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/employeeInfoWithHeaders.csv", numLinesToSkip = 1)
	void testWithCsvSource_2(int id, String firstName, String lastName) {
		Employee emp = new Employee(id, firstName, lastName);
		
		String expected = emp.getId()+","+emp.getFirstName()+","+emp.getLastName();
		String actual = EmployeeUtil.getEmployeeAsString(emp);
		
		assertEquals(expected, actual);
	}
}