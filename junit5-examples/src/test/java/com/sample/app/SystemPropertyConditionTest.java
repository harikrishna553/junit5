package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertyConditionTest {
	
	@BeforeAll
	static void setSystemProperties() {
		System.setProperty("envt", "staging");
	}
	
	@Test
	@EnabledIfSystemProperty(named = "envt", matches = "staging")
	void onlyOnStaging() {
	    assertTrue(true);
	}

	@Test
	@DisabledIfSystemProperty(named = "envt", matches = "staging")
	void notOnStaging() {
		 assertTrue(true);
	}
}