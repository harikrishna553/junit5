package com.sample.app.util;

import java.util.stream.Stream;

public class InputUtil {
	public static Stream<String> getStrings() {
		return Stream.of("apple", "banana", "Carrot", "Mango");
	}
}
