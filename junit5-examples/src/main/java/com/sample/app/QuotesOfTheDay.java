package com.sample.app;

public class QuotesOfTheDay {

	public static String getQuoteOfTheDay(Day day) {

		switch (day) {
		case SATURDAY:
		case SUNDAY:
			return "Happy Holiday";

		case MONDAY:
			return "You always pass failure on the way";
		case TUESDAY:
			return "Winning doesn't always mean being first";

		default:
			return "every day is a great day!!!";
		}

	}

}
