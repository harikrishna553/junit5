package com.sample.app.dummy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("prod")
public class DummyTest {

	@Test
	public void test1() {
		assertTrue(true);
	}
}
