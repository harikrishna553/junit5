package com.sample.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseAfterEachMethods {

	@BeforeEach
	void setupSystem() {
		System.out.println("Setting up the system");
	}

	@BeforeEach
	void setupLogger() {
		System.out.println("Setting up logger");
	}

	@AfterEach
	void cleanupSystem() {
		System.out.println("Cleaning the system\n");
	}

	@AfterEach
	void cleanupLogger() {
		System.out.println("Cleaning logger");
	}
}
