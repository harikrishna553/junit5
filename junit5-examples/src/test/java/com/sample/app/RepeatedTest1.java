package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTest1 {
	
	@RepeatedTest(3)
	void test1() {
		assertTrue(true);
	}

}
