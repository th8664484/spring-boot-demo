package com.controller;

import com.demo.bean.Personnel;
import com.demo.service.PersonnelServiceImpl;
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

    @GetMapping("/toadd")
    public String toadd(){
        return "/thymeleaf/toadd";
    }

    @PostMapping("/add")
    public String add(Personnel personnel){
        persService.add(personnel);
        return "redirect:/list";
    }

    @GetMapping("/toupdate/{name}")
    public String toupdate(Model model,@PathVariable("name") String name){
        model.addAttribute("pers",persService.getPers(name));
        return "/thymeleaf/update";
    }

    @PutMapping("/update")
    public String update(Personnel personnel){
        persService.update(personnel);
        return "redirect:/list";
    }

    @DeleteMapping("/delete/{name}")
    public String datale(@PathVariable("name") String name){
        persService.datale(name);
        return "redirect:/list";
    }


}
