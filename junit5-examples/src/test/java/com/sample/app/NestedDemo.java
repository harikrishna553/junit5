package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedDemo {

	@Test
	void a() {
		assertTrue(true);
	}

	@Nested
	class InnerClass1 {
		@Test
		void innerClass1_a() {
			assertTrue(true);
		}

		@Nested
		class InnerClass2 {
			@Test
			void innerClass2_a() {
				assertTrue(true);
			}
		}
	}

}
