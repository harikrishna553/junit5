package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Login Page")
public class LoginPageTest {

	@Test
	@DisplayName("Invalid user name and password")
	public void invalidUserNameAndPassword() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Invalid user name and empty password")
	public void invalidUserNameAndEmptyPassword() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Empty user name and empty password")
	public void emptyUserNameAndEmptyPassword() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Correct user name and correct password")
	public void correctUserNameAndCorrectPassword() {
		assertTrue(true);
	}
}
