package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagAnnotationDemo {

	@Test
	@Tag("Authentication Test")
	@Tag("Auth Test")
	public void authTest() {
		assertTrue(true, "Authentication tests failed");
	}

	@Test
	@Tag("Speed")
	@Tag("Fast")
	@Tag("Performance")
	public void perfTest() {
		assertTrue(true, "Performance tests failed");
	}
}

