package com.sample.app;

import org.junit.jupiter.api.Test;

public class TestInstanceLifeCycleDemo1 {

	@Test
	public void test1() {
		System.out.println("this: " + this);
	}
	
	@Test
	public void test2() {
		System.out.println("this: " + this);
	}
	
	@Test
	public void test3() {
		System.out.println("this: " + this);
	}
}
