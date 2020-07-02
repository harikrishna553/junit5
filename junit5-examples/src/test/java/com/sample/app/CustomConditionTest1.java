package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sample.app.annotations.EnableOnJwtToken;

public class CustomConditionTest1 {
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
