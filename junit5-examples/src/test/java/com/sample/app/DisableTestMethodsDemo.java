package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableTestMethodsDemo {

	@Test
	void helloTest1() {
		assertTrue(true);
	}
	
	@Test
	@Disabled
	void helloTest2() {
		assertTrue(true);
	}
	
	@Test
	void helloTest3() {
		assertTrue(true);
	}
}
