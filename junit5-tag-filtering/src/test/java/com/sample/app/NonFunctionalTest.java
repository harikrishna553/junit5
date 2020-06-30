package com.sample.app;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class NonFunctionalTest {

	@Test
	@Tag("non-functional")
	public void NonFunctionalTest1() {
		System.out.println("Executing Non-functionalTest1");
	}
	
	@Test
	@Tag("non-functional")
	public void NonFunctionalTest2() {
		System.out.println("Executing Non-functionalTest2");
	}
}
