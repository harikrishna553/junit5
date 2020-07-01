package com.sample.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseAfterAllMethods {
	@BeforeAll
	static void setupSystem() {
		System.out.println("Inside setup system");
	}

	@AfterAll
	static void cleanupSystem() {
		System.out.println("Cleanup system resources");
	}
}
