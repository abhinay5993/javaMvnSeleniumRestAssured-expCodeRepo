package com.empms.beans;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.empms.webapp.SendMail;

public class SendMailBean implements SendMail{

	private MailSender mailsender;

	public void setMailsender(MailSender mailsender) {
	this.mailsender = mailsender;
	}
	
	@Override
	public void sendMail(String from, String to, String subject, String body) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom(from);
		msg.setTo(to);
		msg.setSubject(subject);
		msg.setText(body);
		mailsender.send(msg);

	}

}
