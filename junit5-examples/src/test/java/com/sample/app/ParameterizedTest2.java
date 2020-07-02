package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTest2 {

	private static boolean isStringEmptyOrNull(String str) {
		return str == null || str.trim().isEmpty();
	}

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n", "   \t  " })
	void isStringEmptyOrNull_emptyNullCheck(String input) {
		boolean actual = isStringEmptyOrNull(input);

		assertTrue(actual);
	}
}

