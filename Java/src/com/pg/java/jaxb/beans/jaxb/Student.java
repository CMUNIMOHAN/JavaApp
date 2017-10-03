package com.pg.java.jaxb.beans.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private Integer id;
	private String name;
	private Integer rollnum;
	private String fathername;
	
	
	
	public Student(){
		System.out.println("JAX-B constructor:");
	}

	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public Integer getRollnum() {
		return rollnum;
	}

	public void setRollnum(Integer rollnum) {
		this.rollnum = rollnum;
	}

	@XmlElement
	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollnum=" + rollnum
				+ ", fathername=" + fathername + "]";
	}

	
	

	/*public Student(Integer id, String name, Integer age, String fatherName) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
	}*/
	
	

}
