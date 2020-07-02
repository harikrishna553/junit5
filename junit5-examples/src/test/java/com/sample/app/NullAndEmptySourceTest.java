package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

public class NullAndEmptySourceTest {

	private static int getNumberOfElementsInList(List<Integer> list) {
		if (list == null) {
			return -1;
		}

		return list.size();
	}

	@ParameterizedTest
	@NullSource
	public void getNumberOfElementsInList_null_negativeOne(List<Integer> input) {
		int actualResult = getNumberOfElementsInList(input);

		assertEquals(-1, actualResult);
	}

	@ParameterizedTest
	@EmptySource
	public void getNumberOfElementsInList_emptyList_negativeOne(List<Integer> input) {
		int actualResult = getNumberOfElementsInList(input);

		assertEquals(0, actualResult);
	}

	@ParameterizedTest
	@NullAndEmptySource
	public void getNumberOfElementsInList_nullAndemptyList(List<Integer> input) {
		int actualResult = getNumberOfElementsInList(input);

		if (input == null) {
			assertEquals(-1, actualResult);
		} else {
			assertEquals(0, actualResult);
		}

	}
}
