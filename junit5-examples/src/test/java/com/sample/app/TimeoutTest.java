package com.sample.app;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutTest {

	@Timeout(value = 3, unit = TimeUnit.SECONDS)
	@Test
	void successTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
	}
	
	@Timeout(value = 3, unit = TimeUnit.SECONDS)
	@Test
	void failTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(20);
	}

}