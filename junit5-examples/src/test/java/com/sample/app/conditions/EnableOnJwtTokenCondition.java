package com.sample.app.conditions;

import static org.junit.jupiter.api.extension.ConditionEvaluationResult.disabled;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled;
import static org.junit.platform.commons.util.AnnotationUtils.findAnnotation;

import java.util.Optional;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import com.sample.app.annotations.EnableOnJwtToken;

public class EnableOnJwtTokenCondition implements ExecutionCondition {
	private static final ConditionEvaluationResult ENABLED_BY_DEFAULT = enabled("@EnableOnJwtToken is not present");

	static final ConditionEvaluationResult ENABLED_TEST = enabled("Jwt Token present, enabled test");

	static final ConditionEvaluationResult DISABLED_TEST = disabled("Jwt token not present, disabled test");

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		Optional<EnableOnJwtToken> optional = findAnnotation(context.getElement(), EnableOnJwtToken.class);
		if (optional.isPresent()) {

			String token = System.getProperty("jwtToken");

			if (token != null) {
				return ENABLED_TEST;
			} else {
				return DISABLED_TEST;
			}

		}
		return ENABLED_BY_DEFAULT;
	}

}
