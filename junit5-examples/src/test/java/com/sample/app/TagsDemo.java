package com.sample.app;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class TagsDemo {

	@Test
	@Tags({ @Tag("functional"), @Tag("performance") })
	public void homePageLoadTest_1() {
		System.out.println("Executing homePageLoadTest_1");
	}

	@Test
	@Tag("functional")
	@Tag("performance")
	public void homePageLoadTest_2() {
		System.out.println("Executing homePageLoadTest_2");
	}

}