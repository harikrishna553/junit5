package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled(value="Tests are taking more time and not mandatory for this release")
public class DisableTestClass {

	@Test
	public void anonymmoustTest1() {
		assertTrue(true);
	}
	
	@Test
	public void anonymmoustTest2() {
		assertTrue(true);
	}
	
}
