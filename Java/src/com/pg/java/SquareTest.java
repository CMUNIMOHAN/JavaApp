package com.pg.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void squareTest() {
		Hello junit = new Hello();
		int square = junit.square(10, 10);
		assertEquals(100, square); 
	}

}
