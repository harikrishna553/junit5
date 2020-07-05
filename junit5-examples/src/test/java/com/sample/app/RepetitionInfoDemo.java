package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepetitionInfoDemo {
	
	private static void printRepetitionInfo(RepetitionInfo repetitionInfo) {
		int currentRepetition = repetitionInfo.getCurrentRepetition();
		int totalRepetitions = repetitionInfo.getTotalRepetitions();
		System.out.println("currentRepetition : " + currentRepetition + " , " + "totalRepetitions : " + totalRepetitions);
	}
	
	@BeforeEach
	public void setup(RepetitionInfo repetitionInfo) {
		System.out.println("\nInside Setup method");
		printRepetitionInfo(repetitionInfo);
	}
	
	@DisplayName("TestCase1")
	@RepeatedTest(value = 3, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	void test1(RepetitionInfo repetitionInfo) {
		System.out.println("Inside test1 method");
		printRepetitionInfo(repetitionInfo);
		assertTrue(true);
	}
	
	@AfterEach
	public void cleanup(RepetitionInfo repetitionInfo) {
		System.out.println("Inside cleanup method");
		printRepetitionInfo(repetitionInfo);
	}
	


}
