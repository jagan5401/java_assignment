package com.te.emailSender.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Service
public class EmailSenderService {
	@Autowired
	private JavaMailSender javaMailSender;

	
	public void emailSender(String toEmail, String body, String subject) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("jaganathan1000bc@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);

		javaMailSender.send(message);
		System.out.println("Success");

	}
	
	public void sendEmailWithAttachment(String toEmail, String body, String subject,String attachment) {
		try {
		MimeMessage message=javaMailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message,true);
			helper.setFrom("jaganathan1000bc@gmail.com");
			helper.setTo(new String[]{"sathishenfield1996@gmail.com","karthikeyan5k5k5@gmail.com","anandajay828@gmail.com"});
			helper.setText(body);
			helper.setSubject(subject);
			
			FileSystemResource  fileSystemResource=new FileSystemResource(new File(attachment));
			helper.addAttachment(fileSystemResource.getFilename(),fileSystemResource );
			
			javaMailSender.send(message);
			System.out.println("Success with Attachment");
			
			
			
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
