package com.sample.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachDemo1 {
	
	@BeforeEach
	void beforeEach_1() {
		System.out.println("\nInside beforeEach_1");
	}
	
	@BeforeEach
	void beforeEach_2() {
		System.out.println("Inside beforeEach_2");
	}

	@Test
	public void test1() {
		System.out.println("Inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Inside test2");
	}
}
