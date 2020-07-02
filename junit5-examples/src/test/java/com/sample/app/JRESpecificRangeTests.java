package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.EnabledForJreRange;

public class JRESpecificRangeTests {

	@Test
	@EnabledForJreRange(min = JAVA_9, max = JAVA_11)
	void fromJava9to11() {
		assertTrue(true);
	}

	@Test
	@EnabledForJreRange(min = JAVA_9)
	void fromJava9toCurrentJavaFeatureNumber() {
		assertTrue(true);
	}

	@Test
	@EnabledForJreRange(max = JAVA_11)
	void fromJava8To11() {
		assertTrue(true);
	}

	@Test
	@DisabledForJreRange(min = JAVA_9, max = JAVA_11)
	void notFromJava9to11() {
		assertTrue(true);
	}

	@Test
	@DisabledForJreRange(min = JAVA_9)
	void notFromJava9toCurrentJavaFeatureNumber() {
		assertTrue(true);
	}

	@Test
	@DisabledForJreRange(max = JAVA_11)
	void notFromJava8to11() {
		assertTrue(true);
	}
}