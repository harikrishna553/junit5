package com.sample.app.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.sample.app.Employee;

public class MethodSourceDemo1 {

	@ParameterizedTest
	@MethodSource("provideEmployeeDetails")
	void getEmployeeAsStringTest1(Employee emp) {
		String expected = emp.getId() + "," + emp.getFirstName() + "," + emp.getLastName();
		String actual = EmployeeUtil.getEmployeeAsString(emp);

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@MethodSource("provideEmployeeInfo")
	void getEmployeeAsStringTest2(int id, String firstName, String lastName) {
		Employee emp = new Employee(id, firstName, lastName);
		String expected = emp.getId() + "," + emp.getFirstName() + "," + emp.getLastName();
		String actual = EmployeeUtil.getEmployeeAsString(emp);

		assertEquals(expected, actual);
	}

	private static Stream<Arguments> provideEmployeeDetails() {
		return Stream.of(
				Arguments.of(new Employee(1, "Krishna", "Gurram")),
				Arguments.of(new Employee(2, "Gopi", "Battu")), 
				Arguments.of(new Employee(3, "Ram", "Ponnam"))
				);
	}

	private static Stream<Arguments> provideEmployeeInfo() {
		return Stream.of(
				Arguments.of(1, "Krishna", "Gurram"), 
				Arguments.of(2, "Gopi", "Battu"),
				Arguments.of(3, "Ram", "Ponnam")
				);
	}
}
