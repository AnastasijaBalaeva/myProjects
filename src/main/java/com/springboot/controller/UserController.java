package com.springboot.controller;

import com.springboot.model.InfoBrowser;
import com.springboot.model.UserForm;
import com.springboot.parser.ParserPackageUsers;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class UserController {
    @GetMapping("/userForm")
    public String userForm(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "userForm";
    }
    @PostMapping("/userForm")
    public String userSubmit(@ModelAttribute UserForm userForm) throws IOException, ParseException {
        ParserPackageUsers parserPackageUsers = new ParserPackageUsers();
        parserPackageUsers.toParserJson(userForm);

        userForm.setSurname(null);
        userForm.setName(null);
        userForm.setSurname(null);
        userForm.setAge(0);
        userForm.setSalary(0);
        userForm.setEmail(null);
        userForm.setJob(null);

        return "userForm";
    }


}
