package com.pg.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddTest.class, AllTests.class, ConcatTest.class,
		SquareTest.class })
public class AllTests {

}
