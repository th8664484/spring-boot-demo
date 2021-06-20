package com.demo.controller;

import com.demo.bean.Personnel;
import com.demo.service.PersonnelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonnelController {

    @Autowired
    private PersonnelServiceImpl persService;

    @RequestMapping("/list")
    public String persList(Model model){
        model.addAttribute("personnels",persService.persList());
        return "/thymeleaf/list";
    }

    @RequestMapping("/toadd")
    public String toadd(){
        return "/thymeleaf/toadd";
    }

    @RequestMapping("/add")
    public String add(Personnel personnel){
        persService.add(personnel);
        return "redirect:list";
    }

    @RequestMapping("/toupdate")
    public String toupdate(Model model,String name){
        model.addAttribute("pers",persService.getPers(name));
        return "/thymeleaf/update";
    }

    @RequestMapping("/update")
    public String update(Personnel personnel){
        persService.update(personnel);
        return "redirect:list";
    }

    @RequestMapping("/datale")
    public String datale(String name){
        persService.datale(name);
        return "redirect:list";
    }


}
