package com.sample.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginServTest extends BaseBeforeAllMethods {

	@BeforeAll
	static void setupLogger() {
		System.out.println("Inside setup logger\n");
	}

	@BeforeEach
	void setupCreds() {
		System.out.println("Setting up user credentials");
	}

	@Test
	public void loginTest() {
		System.out.println("Inside login test\n");
	}

	@Test
	public void logoutTest() {
		System.out.println("Inside logout test\n");
	}
}
