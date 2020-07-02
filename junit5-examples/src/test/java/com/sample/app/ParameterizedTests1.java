package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests1 {
	@ParameterizedTest
	@ValueSource(strings = { "Krishna", "Ram", "Gopi" })
	void welcomeUserTest(String userName) {
		assertEquals("Hello " + userName, welcomeUser(userName));
	}

	private static String welcomeUser(String userName) {
		return "Hello " + userName;
	}
}
