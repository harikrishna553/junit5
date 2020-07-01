package com.sample.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginServiceTest extends BaseAfterEachMethods {
	@BeforeEach
	void setupCreds() {
		System.out.println("Setting up user credentials");
	}

	@Test
	public void loginTest() {
		System.out.println("Inside login test");
	}

	@Test
	public void logoutTest() {
		System.out.println("Inside logout test");
	}

	@AfterEach
	void deleteCreds() {
		System.out.println("Deleting Credentials");
	}
}
