package com.pg.java.jaxb;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.pg.java.jaxb.beans.Employee;

public class ObjectToXML {

	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);

			Marshaller mobj = context.createMarshaller();
			mobj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			Employee emp = new Employee(409, "Muni", 23);
			mobj.marshal(emp, new FileOutputStream("employee.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}