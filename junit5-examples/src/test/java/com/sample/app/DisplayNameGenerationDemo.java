package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import com.sample.app.generators.CustomDisplayNameGenerator;

@DisplayNameGeneration(CustomDisplayNameGenerator.class)
public class DisplayNameGenerationDemo {

	@Test
	public void helloTest() {
		assertTrue(true);
	}
}
