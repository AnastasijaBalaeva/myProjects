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
public class SearchController {
    @GetMapping("/search")
    public String searchGet(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "userSearch";
    }


   @PostMapping("/search")
    public String searchSubmit(@ModelAttribute UserForm userForm)  {
       return "userSearch";

    }


    @GetMapping("/userSearch")
    public String userSearchGet(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "userSearch";
    }


    @PostMapping("/userSearch")
    public String userSearch(@ModelAttribute UserForm userForm, @ModelAttribute InfoBrowser infoBrowser, HttpServletRequest request) throws IOException, ParseException {
        infoBrowser.setAgentInfo(request);
        ParserPackageUsers parserPackageUsers = new ParserPackageUsers();
        UserForm userSearchResult = parserPackageUsers.fromParseJson(userForm.getSurname(), userForm.getName());
        if (userSearchResult == null)
            return "userNotFound";
        else {
            userForm.setSurname(userSearchResult.getSurname());
            userForm.setName(userSearchResult.getName());
            userForm.setPatronymic(userSearchResult.getPatronymic());
            userForm.setAge(userSearchResult.getAge());
            userForm.setSalary(userSearchResult.getSalary());
            userForm.setEmail(userSearchResult.getEmail());
            userForm.setJob(userSearchResult.getJob());
            return "/userSearchResult";
        }


    }

}
