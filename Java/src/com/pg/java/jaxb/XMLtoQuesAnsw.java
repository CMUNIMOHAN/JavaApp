package com.pg.java.jaxb;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.pg.java.jaxb.beans.Answers;
import com.pg.java.jaxb.beans.Question;

public class XMLtoQuesAnsw {

	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(Question.class);
			File file = new File("question.xml");
			Unmarshaller unobj = context.createUnmarshaller();

			Question ques = (Question) unobj.unmarshal(file);
			System.out.println(ques);

			List<Answers> list = ques.getAnswers();
			for (Answers ans : list) {
				System.out.println(ans);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}