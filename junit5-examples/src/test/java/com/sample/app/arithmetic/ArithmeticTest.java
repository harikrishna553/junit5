package com.sample.app.arithmetic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticTest {

	private static int sum(int a, int b) {
		return a + b;
	}

	@Test
	public void test1() {
		assertEquals(5, sum(2, 3));
	}

}
