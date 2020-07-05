package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

public class DynamicContainerDemo1 {
	@TestFactory
	Stream<DynamicNode> dynamicTestsWithContainers() {
		return Stream
				.of("Hello")
				.map(input -> dynamicContainer("Container " + input,
						Stream.of(dynamicTest("not null", () -> assertNotNull(input)),
								dynamicContainer("properties",Stream.of(
										dynamicTest("length > 0", () -> assertTrue(input.length() > 0)),
										dynamicTest("not empty", () -> assertFalse(input.isEmpty())))),
										dynamicContainer("utilities", Stream.of(
												dynamicTest("string reversal", () -> assertEquals("olleH", reverse(input))))))));
	}

	private static String reverse(String str) {
		return new StringBuilder().append(str).reverse().toString();
	}
}
