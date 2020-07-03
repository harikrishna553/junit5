package com.sample.app.providers;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class EmployeeArgumentsProvider implements ArgumentsProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		return Stream.of(
				Arguments.of(1, "Krishna", "Gurram"), 
				Arguments.of(2, "Gopi", "Battu"),
				Arguments.of(3, "Ram", "Ponnam")
				);
	}

}
