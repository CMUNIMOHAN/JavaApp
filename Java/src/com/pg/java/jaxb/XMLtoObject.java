package com.pg.java.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.pg.java.jaxb.beans.Employee;

public class XMLtoObject {

	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			File file = new File("employee.xml");
			
			Unmarshaller unobj = context.createUnmarshaller();
			Employee emp = (Employee) unobj.unmarshal(file);
			System.out.println("ID: "+emp.getId());
			System.out.println("NAME: "+emp.getName());
			System.out.println("AGE: "+emp.getAge());
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
}