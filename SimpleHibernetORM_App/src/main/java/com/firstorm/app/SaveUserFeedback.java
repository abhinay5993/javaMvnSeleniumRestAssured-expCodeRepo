package com.firstorm.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.firstorm.feedpojo.CustomerFeedbackDetails;
import com.github.javafaker.Faker;

public class SaveUserFeedback {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faker fkg=new Faker();
		String emailData=fkg.name().firstName()+"@gmail.com";
		String feedMsg=fkg.dragonBall().character();
		int rateCount=fkg.number().numberBetween(0,10);
		
		//Persistance Object
		CustomerFeedbackDetails cusFeedObj=new CustomerFeedbackDetails();
		cusFeedObj.setUserEmail(emailData);
		cusFeedObj.setFeedBackMsg(feedMsg);
		cusFeedObj.setRateCount(rateCount);
		
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");
		
		SessionFactory sf = configObj.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t1 = ses.beginTransaction();
		
		ses.save(cusFeedObj);
		t1.commit();
		System.out.println("\nFeedBack!! data saved to table..");
		ses.close();
	}
	
}