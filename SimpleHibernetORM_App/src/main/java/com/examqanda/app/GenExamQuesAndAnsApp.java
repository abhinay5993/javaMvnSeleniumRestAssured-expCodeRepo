package com.examqanda.app;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.examqanda.mappingpojo.QuestioniorsDetails;
import com.github.javafaker.Faker;

public class GenExamQuesAndAnsApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Faker fkg=new Faker();
		String quest1Desc=fkg.leagueOfLegends().masteries();
		String quest2Desc=fkg.leagueOfLegends().masteries();
		String quest3Desc=fkg.leagueOfLegends().masteries();
		String ans1Det=fkg.leagueOfLegends().rank();
		String ans2Det=fkg.leagueOfLegends().rank();
		String ans3Det=fkg.leagueOfLegends().rank();
		
		List<String> lsifOfAns=new LinkedList<>();
		lsifOfAns.add(ans1Det);
		lsifOfAns.add(ans2Det);
		lsifOfAns.add(ans3Det);
		
		//Persistance Object
		QuestioniorsDetails quesObj=new QuestioniorsDetails();
		quesObj.setQuestDesc(quest1Desc);
		quesObj.setQuestDesc(quest2Desc);
		quesObj.setQuestDesc(quest3Desc);
		quesObj.setListOfAns(lsifOfAns);
		
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");
		
		SessionFactory sf = configObj.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t1 = ses.beginTransaction();
		
		ses.save(quesObj);
		t1.commit();
		System.out.println("\nExam Papers Question & Ans saved!! to table..");
		ses.close();

	}

}