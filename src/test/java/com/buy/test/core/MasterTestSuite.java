package com.buy.test.core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.buy.test.date.DateJunit;


@RunWith(value = Suite.class)
@SuiteClasses(value = {ParameterizedTest.class ,DateJunit.class})
public class MasterTestSuite {

}
