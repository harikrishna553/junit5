package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestDemo2 {

	@TestFactory
	Collection<DynamicTest> dynamicTestsFromCollection() {
		return Arrays.asList(
				dynamicTest("1st dynamic test", () -> assertEquals("olleh", reverseString("hello"))),
				dynamicTest("2nd dynamic test", () -> assertEquals(4, sum(2, 2))),
				dynamicTest("3rd dynamic test", () -> assertEquals(5, length("Hello"))));
	}
	
	@TestFactory
	Iterable<DynamicTest> dynamicTestsFromIterable() {
		return Arrays.asList(
				dynamicTest("1st dynamic test", () -> assertEquals("olleh", reverseString("hello"))),
				dynamicTest("2nd dynamic test", () -> assertEquals(4, sum(2, 2))),
				dynamicTest("3rd dynamic test", () -> assertEquals(5, length("Hello"))));
	}
	
	@TestFactory
	Iterator<DynamicTest> dynamicTestsFromIterator() {
		return Arrays.asList(
				dynamicTest("1st dynamic test", () -> assertEquals("olleh", reverseString("hello"))),
				dynamicTest("2nd dynamic test", () -> assertEquals(4, sum(2, 2))),
				dynamicTest("3rd dynamic test", () -> assertEquals(5, length("Hello")))).iterator();
	}
	
	@TestFactory
	DynamicTest[] dynamicTestsFromArray() {
		return new DynamicTest[] {
				dynamicTest("1st dynamic test", () -> assertEquals("olleh", reverseString("hello"))),
				dynamicTest("2nd dynamic test", () -> assertEquals(4, sum(2, 2))),
				dynamicTest("3rd dynamic test", () -> assertEquals(5, length("Hello")))};
	}
	
	 @TestFactory
	 Stream<DynamicTest> dynamicTestsFromIntStream() {
		 return IntStream
				 .iterate(0, n -> n + 2)
				 .limit(5)
				 .mapToObj(n -> dynamicTest("isEven : " + n, () -> assertTrue(n % 2 == 0)));
	}

	private static String reverseString(String str) {
		return new StringBuilder().append(str).reverse().toString();
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int length(String str) {
		if (str == null)
			return 0;
		return str.length();
	}

}