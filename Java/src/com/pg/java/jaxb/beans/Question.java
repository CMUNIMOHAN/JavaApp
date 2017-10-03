package com.pg.java.jaxb.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {

	private int qid;
	private String qname;
	private List<Answers> answers;

	public Question() {
	}

	public Question(int qid, String qname, List<Answers> answers) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.answers = answers;
	}

	@XmlAttribute
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	@XmlElement
	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	@XmlElement
	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + ", answers="
				+ answers + "]";
	}

	
}