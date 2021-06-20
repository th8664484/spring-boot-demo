package com.demo.controller;

import com.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("/thyem")
    public String index(Model model){
        User user = new User();
        user.setName("张三");
        user.setSeg("男");
//        model.addAttribute("name","<h1>张三</h1>");
        model.addAttribute("user",user);
        return "/thymeleaf/index";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "/thymeleaf/welcome";
    }
}
