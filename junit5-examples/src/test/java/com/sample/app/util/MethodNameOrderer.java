package com.sample.app.util;

import java.util.Comparator;

import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrdererContext;

public class MethodNameOrderer implements MethodOrderer {
	@Override
	public void orderMethods(MethodOrdererContext context) {
		context.getMethodDescriptors().sort(METHOD_NAME_COMPARATOR);
	}

	private static final Comparator<MethodDescriptor> METHOD_NAME_COMPARATOR = new Comparator<MethodDescriptor>() {

		@Override
		public int compare(MethodDescriptor methodDescriptor1, MethodDescriptor methodDescriptor2) {

			return methodDescriptor1.getMethod().getName().compareTo(methodDescriptor2.getMethod().getName());

		}

	};

}
