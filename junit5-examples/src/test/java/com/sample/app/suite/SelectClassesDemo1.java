package com.sample.app.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

import com.sample.app.arithmetic.ArithmeticTest;
import com.sample.app.dummy.DummyTest;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Platform Suite Demo")
@SelectClasses({ DummyTest.class, ArithmeticTest.class })
public class SelectClassesDemo1 {

}
