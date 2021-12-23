package com.springboot.controller;

import com.springboot.model.EmailForm;
import com.springboot.model.UserForm;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.mail.MessagingException;
import java.io.IOException;

@Controller
public class EmailController {
    @Autowired
    private JavaMailSender emailSender;

    @GetMapping("/email_send")
    public String emailGet(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "/emailForm";
    }


    @PostMapping("/email_send")
    public String emailSubmit(@ModelAttribute EmailForm emailForm)  {
        return "emailForm";

    }
    @GetMapping("/emailForm")
    public String userEmailGet(Model model) {
        model.addAttribute("emailForm", new EmailForm());
        return "emailForm";
    }


    @PostMapping("/emailForm")
    public String sendMail(@ModelAttribute EmailForm emailForm) throws IOException, ParseException {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(emailForm.getAddressee());
        message.setSubject(emailForm.getTheme());
        message.setText(emailForm.getMessage());
        this.emailSender.send(message);

        emailForm.setAddressee(null);
        emailForm.setMessage(null);
        emailForm.setTheme(null);

        return "emailSuccessfully";
    }
}
