package com.pg.java.collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ElementsTest {
	
	@Test
	public void eleTest(){
		ArrayListDemo al = new ArrayListDemo();
		al.setName("Muni");
		assertEquals("Muni", al.getName()); 
		al.setAge(23);
		assertEquals(23, al.getAge()); 
		al.setId(409);
		assertEquals(409, al.getId());
	}
	
	
	@Test
	public void carTest(){
		Car c = new Car();
		List<String> list = new ArrayList<String>();
		list.add("bmw");
		list.add("nano");
//		for(String s : list)
		assertEquals(list, c.getCars());
	}
}