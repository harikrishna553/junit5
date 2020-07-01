package com.sample.app;

import org.junit.jupiter.api.BeforeEach;

public class BaseBeforeEachMethods {

	@BeforeEach
	void setupSystem() {
		System.out.println("Setting up the system");
	}
	
	@BeforeEach
	void setupLogger() {
		System.out.println("Setting up logger");
	}
}
