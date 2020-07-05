package com.sample.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedTestCustomDisplayName {
	@DisplayName("demoTest")
	@ParameterizedTest(name = "{index} ==> the Capital of ''{0}'' is {1}")
	@CsvSource({ "India, New Delhi", "AFGHANISTAN, KABUL", "'CENTRAL AFRICAN REPUBLIC', BANGUI" })
	void testWithCustomDisplayNames(String country, String capital) {
		
		
	}
}
