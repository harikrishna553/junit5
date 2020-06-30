package com.sample.app;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class PerformanceTest {
	@Test
	@Tag("performance")
	public void perfTest1() {
		System.out.println("Executing perfTest1");
	}
	
	@Test
	@Tag("performance")
	public void perfTest2() {
		System.out.println("Executing perfTest2");
	}
}
