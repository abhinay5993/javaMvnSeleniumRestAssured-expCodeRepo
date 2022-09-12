package com.sprmail.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.empms.webapp.SendMail;

public class TestSendMailClient {
	
	public static void main(String[] args) {


		ApplicationContext ctx = new ClassPathXmlApplicationContext("configs/mail-cfg.xml");
		SendMail sm = (SendMail)ctx.getBean("ms");
		sm.sendMail("khajarafifullstackdeveloper@gmail.com", "khajarafimca@gmail.com", "wish msg SpringMail Serverice ..from Abhinay L", "happy aug15th.. Happy Codeing!!.. FSD..");
		System.out.println("mail devliverd succssfully!!!");
		}

}
