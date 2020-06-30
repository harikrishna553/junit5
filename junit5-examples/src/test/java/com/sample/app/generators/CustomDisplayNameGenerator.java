package com.sample.app.generators;

import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayNameGenerator;

public class CustomDisplayNameGenerator implements DisplayNameGenerator {

	@Override
	public String generateDisplayNameForClass(Class<?> testClass) {
		String name = testClass.getName();
		int lastDot = name.lastIndexOf('.');
		return name.substring(lastDot + 1);
	}

	@Override
	public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
		return nestedClass.getSimpleName();
	}

	@Override
	public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
		String className = generateDisplayNameForClass(testClass);
		String methodName = testMethod.getName();

		return className + "_" + methodName;
	}

}
