package com.sample.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.sample.app.model.Student;

public class StringToObjectConverterTest {
	
	@ParameterizedTest
	@ValueSource(strings = "Gopi")
	void test1(Student student) {
	    assertEquals("Gopi", student.getName());
	}
	
}
