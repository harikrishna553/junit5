package com.sample.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTestMethodDemo {

	@Test
	@Order(1)
	public void loginTest() {
		System.out.println("Executing login test");
	}

	@Test
	@Order(3)
	public void logoutTest() {
		System.out.println("Logged out Successfully!!!!");
	}

	@Test
	@Order(2)
	public void sendMoneyTest() {
		System.out.println("Transferred money");
	}

	@Test
	@Order(3)
	public void receiveReceiptTest() {
		System.out.println("Received receipt");
	}

}
