package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTest2 {

	@DisplayName("TestCase1")
	@RepeatedTest(value = 3, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	void test1() {
		assertTrue(true);
	}

	@DisplayName("TestCase2")
	@RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
	void test2() {
		assertTrue(true);
	}

	@RepeatedTest(value = 3, name = RepeatedTest.SHORT_DISPLAY_NAME)
	void test3() {
		assertTrue(true);
	}
}
