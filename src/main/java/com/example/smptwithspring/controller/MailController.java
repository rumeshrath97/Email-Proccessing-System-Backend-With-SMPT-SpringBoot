package com.example.smptwithspring.controller;

import com.example.smptwithspring.DTO.MailControllerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/mail")
public class MailController {

    /*Plugged Java Mail Sender*/
    @Autowired
    private JavaMailSender javaMailSender;

    /*Create a post method to send email and create DTO to import DTO class*/
    @PostMapping("/send")
    public String sendEmail(@RequestBody MailControllerDTO mailControllerDTO){
        try{
            SimpleMailMessage message=new SimpleMailMessage();
            message.setSubject(mailControllerDTO.getSubject());
            message.setFrom("g9673.rumesh@gmail.com");
            message.setTo(mailControllerDTO.getToMail());
            message.setText(mailControllerDTO.getMessage());

            javaMailSender.send(message);
            return "Success!";

        } catch (Exception e){
            return e.getMessage();
        }

    }
}
