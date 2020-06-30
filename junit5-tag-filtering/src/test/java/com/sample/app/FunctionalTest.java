package com.sample.app;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class FunctionalTest {

	@Test
	@Tag("functional")
	public void functionalTest1() {
		System.out.println("Executing functionalTest1");
	}
	
	@Test
	@Tag("functional")
	public void functionalTest2() {
		System.out.println("Executing functionalTest2");
	}
}
