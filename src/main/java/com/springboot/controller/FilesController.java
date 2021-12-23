package com.springboot.controller;

import com.springboot.model.UserForm;
import com.springboot.parser.ParserPackageUsers;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class FilesController {
    @GetMapping("/loaded")
    public String redirectUserForm(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "/loadeadFiles";
    }

    @PostMapping("/loaded")
    public String SearchSubmit(@ModelAttribute UserForm userForm)  {
        return "loadeadFiles";

    }
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile multipartFile, @ModelAttribute UserForm userForm) throws IOException, ParseException {
        ParserPackageUsers parserPackageUsers = new ParserPackageUsers();
        boolean flag = parserPackageUsers.getOriginalFilename(multipartFile);
        if (flag) {
            return "/loadedSuccessfully";}
        else {
            //userParser.deleteUploadedFile(file);
            return "errorFiles";
        }
    }
}
