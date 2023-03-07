package com.te.emailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.te.emailSender.service.EmailSenderService;
@SpringBootApplication
public class Application {

	
	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		String email = "sathishenfield1996@gmail.com";
		String body = "Email has Attachment Send Succesfully";
		String sub = "This is the body of the Subject";
		String attachment="D:\\Documents\\Design Pattern.pdf";

		//service.emailSender(email, body, sub);//for simple email messege
		service.sendEmailWithAttachment(email, body, sub, attachment);
		
		
		
	}
}
