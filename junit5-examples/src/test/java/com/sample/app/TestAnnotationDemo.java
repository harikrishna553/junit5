package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestAnnotationDemo {

	@Test
	void testSuccessScenario() {
		assertEquals(5, 2 + 3, "Sum of 2 and 3 is not equal to 5");
	}

	@Test
	void testFailureScenario() {
		assertTrue(false);
	}
}
