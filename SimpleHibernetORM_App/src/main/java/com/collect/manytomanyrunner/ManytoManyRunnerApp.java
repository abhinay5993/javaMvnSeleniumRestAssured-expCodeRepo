package com.collect.manytomanyrunner;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.collect.manytomanymappings.PersistAnswers;
import com.collect.manytomanymappings.PersistQuest;

public class ManytoManyRunnerApp {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction ts = s.beginTransaction();
		
		PersistAnswers a1 = new PersistAnswers();
		a1.setAnswer("Java is Platform Independent");
		a1.setPname("Umesh");
		PersistAnswers a2 = new PersistAnswers();
		a2.setAnswer("Java is 100% OO");
		a2.setPname("Shruti");
		PersistAnswers a3 = new PersistAnswers();
		a3.setAnswer("Java is Robust");
		a3.setPname("Shweta");
		PersistAnswers a4 = new PersistAnswers();
		a4.setAnswer("Java is Dynamic");
		a4.setPname("Nikita");
		ArrayList<PersistAnswers> list1 = new ArrayList<PersistAnswers>();
		list1.add(a1);
		list1.add(a2);
		ArrayList<PersistAnswers> list2 = new ArrayList<PersistAnswers>();
		list2.add(a3);
		list2.add(a4);
		
		PersistQuest q1 = new PersistQuest();
		q1.setQname("What is impotrant feature of Java?");
		q1.setAnswer(list1);
		PersistQuest q2 = new PersistQuest();
		q2.setQname("Which is most powerfull feature among 2 of them?");
		q2.setAnswer(list2);
		
		s.persist(q1);
		s.persist(q2);
		ts.commit();
		s.close();
		sf.close();
	}

}