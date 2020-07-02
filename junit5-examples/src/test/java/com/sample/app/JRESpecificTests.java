package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.condition.JRE.JAVA_10;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.JRE.JAVA_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;

public class JRESpecificTests {
	@Test
	@EnabledOnJre(JAVA_8)
	void onlyOnJava8() {
		assertTrue(true);
	}

	@Test
	@EnabledOnJre({ JAVA_8, JAVA_9, JAVA_10 })
	void onJava8or9Or10() {
		assertTrue(true);
	}

	@Test
	@DisabledOnJre(JAVA_8)
	void notOnJava8() {
		assertTrue(true);
	}
}