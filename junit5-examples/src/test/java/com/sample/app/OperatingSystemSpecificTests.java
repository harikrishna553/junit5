package com.sample.app;

import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;
import static org.junit.jupiter.api.condition.OS.WINDOWS;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;

public class OperatingSystemSpecificTests {
	@Test
	@EnabledOnOs(MAC)
	void onlyOnMacOs() {
		System.out.println("This test executes only on MAC");
	}

	@Test
	@EnabledOnOs(WINDOWS)
	void onlyOnWindows() {
		System.out.println("This test executes only on WINDOWS");
	}

	@Test
	@EnabledOnOs({ LINUX, MAC })
	void onLinuxOrMac() {
		System.out.println("This test executes only on MAC and Linux");
	}

	@Test
	@DisabledOnOs(WINDOWS)
	void notOnWindows() {
		System.out.println("This test do not executes on Windows");
	}
}
