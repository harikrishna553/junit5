package com.sample.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAllDemo1 {
	
	@BeforeAll
	static void beforeAll_1() {
		System.out.println("Inside beforeAll_1\n");
	}
	
	@BeforeAll
	static void beforeAll_2() {
		System.out.println("Inside beforeAll_2\n");
	}
	
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

	@AfterEach
	void afterEach_1() {
		System.out.println("Inside afterEach_1");
	}

	@AfterEach
	void afterEach_2() {
		System.out.println("Inside afterEach_2");
	}
	
	@AfterAll
	static void afterAll_1() {
		System.out.println("\nInside afterAll_1");
	}
	
	@AfterAll
	static void afterAll_2() {
		System.out.println("\nInside afterAll_2");
	}
}
