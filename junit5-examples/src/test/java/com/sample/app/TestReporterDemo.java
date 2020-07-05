package com.sample.app;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

public class TestReporterDemo {
	@Test
	void reportSingleValue(TestReporter testReporter) {
		System.out.println("\nInside reportSingleValue method");
		testReporter.publishEntry("a status message");
	}

	@Test
	void reportKeyValuePair(TestReporter testReporter) {
		System.out.println("\nInside reportKeyValuePair method");
		testReporter.publishEntry("methodName", "reportKeyValuePair");
	}

	@Test
	void reportMultipleKeyValuePairs(TestReporter testReporter) {
		System.out.println("\nInside reportMultipleKeyValuePairs method");
		
		Map<String, String> values = new HashMap<>();
		testReporter.publishEntry("methodName", "reportMultipleKeyValuePairs");
		testReporter.publishEntry("demo", "TestReporter");

		testReporter.publishEntry(values);
	}
}
