package com.pg.java.jaxb.beans.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.pg.java.jaxb.beans.jaxb.Student;

public class StudentUnMarshal {

	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);
			File file = new File("student.xml");

			Unmarshaller unobj = context.createUnmarshaller();
			Student stu = (Student) unobj.unmarshal(file);

			System.out.println("Student ID:" + stu.getId());
			System.out.println("Student Name:" + stu.getName());
			System.out.println("Student RollNum:" + stu.getRollnum());
			System.out.println("Student FatherNAme:" + stu.getFathername());

			System.out
					.println("**************** Set thedata to XML ******************");

			stu.setId(101);
			stu.setName("Sai");
			stu.setRollnum(26);
			stu.setFathername("Sai Father");

			System.out
					.println("**************** Set thedata to XML End******************");

			System.out.println("Student ID:" + stu.getId());
			System.out.println("Student Name:" + stu.getName());
			System.out.println("Student RollNum:" + stu.getRollnum());
			System.out.println("Student FatherNAme:" + stu.getFathername());

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}