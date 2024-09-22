package com.naveen.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String name,String email, String phone, String msg){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("naveenben55@gmail.com");
        message.setSubject("Portfolio Message");
        message.setText("Name: " + name + " || " +"Email: " +  email + " || " + "Phone: " + phone + " || " + "Message: " +msg);
        mailSender.send(message);
    }
}
