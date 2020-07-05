package com.sample.app.aggregators;

import java.time.LocalDate;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

import com.sample.app.model.Gender;
import com.sample.app.model.Person;

public class PersonAggregator implements ArgumentsAggregator {

	@Override
	public Person aggregateArguments(ArgumentsAccessor arguments, ParameterContext context)
			throws ArgumentsAggregationException {
		return new Person(arguments.getString(0), arguments.getString(1), arguments.get(2, Gender.class),
				arguments.get(3, LocalDate.class));
	}

}
