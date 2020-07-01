package com.sample.app;

import org.junit.jupiter.api.BeforeAll;

public class BaseBeforeAllMethods {
	
	@BeforeAll
	static void setupSystem() {
		System.out.println("Inside setup system");
	}

}
