package com.sample.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoginImplTest extends BaseAfterAllMethods{
	@BeforeAll
	static void setupCreds() {
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

	@AfterAll
	static void deleteCreds() {
		System.out.println("Delete user credentials");
	}

}
