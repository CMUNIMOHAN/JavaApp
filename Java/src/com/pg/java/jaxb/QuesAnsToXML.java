package com.pg.java.jaxb;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.pg.java.jaxb.beans.Answers;
import com.pg.java.jaxb.beans.Question;

public class QuesAnsToXML {

	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(Question.class);

			Marshaller mobj = context.createMarshaller();
			mobj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			Answers ans1 = new Answers(101, "ws is a technology", "Oracle");
			Answers ans2 = new Answers(102,
					"ws is exposes an behavoiur of browser", "SUN");
			Answers ans3 = new Answers(103, "RESTful ws are Architectural style",
					"jboos");

			List<Answers> list = new ArrayList<Answers>();
			list.add(ans1);
			list.add(ans2);
			list.add(ans3);

			Question qus = new Question(1, "what is webservice?", list);

			mobj.marshal(qus, new FileOutputStream("question.xml"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}