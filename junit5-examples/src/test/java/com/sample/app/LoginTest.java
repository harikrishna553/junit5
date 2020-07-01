package com.sample.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseBeforeEachMethods{
	
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
