package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceTest2 {
	
	@ParameterizedTest
	@EnumSource(names = { "MONDAY", "FRIDAY"})
	void getQuoteOfTheDayTest(Day day) {
		String actualQuote = QuotesOfTheDay.getQuoteOfTheDay(day);

		if (day == Day.SATURDAY || day == Day.SUNDAY) {
			assertEquals("Happy Holiday", actualQuote);
		} else if (day == Day.MONDAY) {
			assertEquals("You always pass failure on the way", actualQuote);
		} else if (day == Day.TUESDAY) {
			assertEquals("Winning doesn't always mean being first", actualQuote);
		} else {
			assertEquals("every day is a great day!!!", actualQuote);
		}

	}

}