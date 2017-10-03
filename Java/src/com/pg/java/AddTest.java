package com.pg.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void addTest() {
		Hello hello = new Hello();
		int result = hello.add(10, 20);
//		assertEquals(31, result); //fails
//		assertEquals(30, result);
		assertEquals(30, result);
	}

}
