package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class AssumptionsDemo {
	@Test
	public void onlyOnWindows() {
		assumeTrue(isWindows());
		assertTrue(true);
	}

	@Test
	public void notOnWindows() {
		assumeTrue(!isWindows());
		assertTrue(true);
	}

	private static boolean isWindows() {
		String osType = System.getProperty("os.name");
		if (osType.contains("windows") || osType.contains("Windows") || osType.contains("WINDOWS")) {
			return true;
		}
		return false;
	}
}