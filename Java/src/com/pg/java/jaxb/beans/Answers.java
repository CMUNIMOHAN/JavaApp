package com.pg.java.jaxb.beans;

public class Answers {

	private int aid;
	private String aname;
	private String author;

	public Answers() {
	}

	public Answers(int aid, String aname, String author) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.author = author;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Answers [aid=" + aid + ", aname=" + aname + ", author="
				+ author + "]";
	}
	
	

}