package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sample.app.annotations.EnableOnJwtToken;

public class CustomConditionTest {

	@BeforeAll
	static void setupJWTToken() {
		System.setProperty("jwtToken", "token123");
	}

	@Test
	@EnableOnJwtToken
	void test1() {
		System.out.println("Executing test1");
		assertTrue(true);
	}

	@Test
	@EnableOnJwtToken
	void test2() {
		System.out.println("Executing test2");
		assertTrue(true);
	}

}
