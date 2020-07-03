package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.sample.app.providers.EmployeeArgumentsProvider;
import com.sample.app.util.EmployeeUtil;

public class ArgumentsSourceTest {
	@ParameterizedTest
	@ArgumentsSource(EmployeeArgumentsProvider.class)
	void getEmployeeAsStringTest(int id, String firstName, String lastName) {
		Employee emp = new Employee(id, firstName, lastName);
		String expected = emp.getId() + "," + emp.getFirstName() + "," + emp.getLastName();
		String actual = EmployeeUtil.getEmployeeAsString(emp);

		assertEquals(expected, actual);
	}
}