package com.controller;


import com.service.PersonnelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonnelController {

    @Autowired
    private PersonnelServiceImpl persService;

    @GetMapping ("/list")
    public String persList(Model model){
        model.addAttribute("personnels",persService.persList());
        return "/thymeleaf/list";
    }

}
