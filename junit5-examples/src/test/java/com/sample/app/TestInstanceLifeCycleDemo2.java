package com.sample.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestInstanceLifeCycleDemo2 {
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
