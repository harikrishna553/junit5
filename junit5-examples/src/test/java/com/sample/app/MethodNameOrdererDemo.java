package com.sample.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.sample.app.util.MethodNameOrderer;

@TestMethodOrder(MethodNameOrderer.class)
public class MethodNameOrdererDemo {
	@Test
	void A_1() {
		System.out.println("Executing A_1");
	}

	@Test
	void A() {
		System.out.println("Executing A");
	}

	@Test
	void D() {
		System.out.println("Executing D");
	}

	@Test
	void B() {
		System.out.println("Executing B");
	}

	@Test
	void H() {
		System.out.println("Executing H");
	}

	@Test
	void F() {
		System.out.println("Executing F");
	}

	@Test
	void C() {
		System.out.println("Executing C");
	}
}
