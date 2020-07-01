package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedDemo1 {

	@BeforeAll
	static void systemSetup() {
		System.out.println("Setting up System");
	}

	@BeforeEach
	void filesSetup() {
		System.out.println("\nSetting up dummmy files for test case");
	}

	@AfterEach
	void filesClean() {
		System.out.println("Delete dummy files");
	}

	@AfterAll
	static void systemCleanup() {
		System.out.println("\nCleaning up System");
	}

	@Test
	void a() {
		System.out.println("Executing test mehthod a()");
		assertTrue(true);
	}

	@Nested
	class InnerClass1 {
		@Test
		void innerClass1_a() {
			System.out.println("Executing test mehthod innerClass1_a()");
			assertTrue(true);
		}

	}
}
