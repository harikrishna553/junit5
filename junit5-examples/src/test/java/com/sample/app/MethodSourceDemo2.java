package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MethodSourceDemo2 {

	private static int getLength(String str) {
		if (str == null) {
			return -1;
		}
		return str.length();
	}

	@ParameterizedTest
	@MethodSource("stringProvider")
	void getLengthTest(String input) {
		int expectedLength = (input == null) ? -1 : input.length();
		int actualLength = getLength(input);

		assertEquals(expectedLength, actualLength);
	}

	static Stream<String> stringProvider() {
		return Stream.of("apple", "banana", "Carrot", "Mango");
	}

}

