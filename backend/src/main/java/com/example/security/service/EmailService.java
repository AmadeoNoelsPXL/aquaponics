package com.example.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(String token){
        String usedToken = token;
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noels.amadeo@gmail.com");
        message.setTo("noels.amadeo@gmail.com");
        message.setText("<a src='http://localhost:8081/user/setPassword?token="+token+"'click</a>");

        javaMailSender.send(message);
    }
}
