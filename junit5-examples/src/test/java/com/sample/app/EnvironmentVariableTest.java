package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnvironmentVariableTest {

	@Test
	@EnabledIfEnvironmentVariable(named = "env", matches = "staging")
	void onlyOnStagingEnvt() {
		assertTrue(true);
	}

	@Test
	@DisabledIfEnvironmentVariable(named = "env", matches = "staging")
	void notOnStagingEnvt() {
		assertTrue(true);
	}
	
}