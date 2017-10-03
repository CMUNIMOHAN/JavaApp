package com.pg.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void concatTest() {
		Hello junit = new Hello();
		String result = junit.Concat("java", "campus");
		assertEquals("javacampus", result); 
	}

}
