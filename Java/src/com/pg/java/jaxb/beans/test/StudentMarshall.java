package com.pg.java.jaxb.beans.test;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.pg.java.jaxb.beans.jaxb.Student;

public class StudentMarshall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);

			Marshaller mobj = context.createMarshaller();
			mobj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			Student stu = new Student();
			stu.setId(101);stu.setName("Sai");stu.setRollnum(26);
			stu.setFathername("Sai Father");
			mobj.marshal(stu, new FileOutputStream("student.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
