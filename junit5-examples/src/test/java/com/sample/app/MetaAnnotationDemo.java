package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MetaAnnotationDemo {
	
	@SpeedTest
	public void speedTest1() {
		assertTrue(true);
	}

}
