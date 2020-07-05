package com.sample.app;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestInfoParameterResolverDemo {

	public TestInfoParameterResolverDemo(TestInfo testInfo) {
		System.out.println("\nInside Constructor");
		String displayName = testInfo.getDisplayName();
		System.out.println("\t" + displayName);
	}

	@BeforeEach
	void init(TestInfo testInfo) {
		System.out.println("\nInside init method");
		String displayName = testInfo.getDisplayName();
		System.out.println("\t" + displayName);
	}

	@Test
	@DisplayName("TEST 1")
	@Tag("demoTest")
	@Tag("helloworld")
	void test1(TestInfo testInfo) {
		System.out.println("\nInside test1 method");

		String displayName = testInfo.getDisplayName();
		Set<String> tags = testInfo.getTags();

		System.out.println("\t" + displayName);
		System.out.println("\t" + tags);

	}

	@Test
	void test2() {
		System.out.println("\nInside test2 method");
	}

}
