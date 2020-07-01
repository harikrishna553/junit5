package com.sample.app.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.condition.OS.*;

public class ConditionsDemo {
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
