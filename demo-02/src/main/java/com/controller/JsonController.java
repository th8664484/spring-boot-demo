package com.controller;

import com.bean.Salad;
import com.bean.Student;
import com.bean.Vegetables;
import com.config.SaladConfig;
import com.config.StudentConfig;
import com.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 * 是@Controller和@ResponseBody的组合
 * 返回json形式的响应结果 而不是视图（jsp html）
 */
@RestController
public class JsonController {

    @Autowired
    private StudentConfig studentConfig ;
    @Autowired
    private VegetablesConfig vegetablesConfig;
    @Autowired
    private SaladConfig saladConfig;

    @Value("${username}")
    private String username;
    @Value("${password}")
    private Integer password;

    @RequestMapping("/json")
    public String json(){
        return "Hello JSON";
    }

    @RequestMapping("/jasypt")
    public String encryptor(){
        return username+":"+password;
    }
    @RequestMapping("/student")
    public Student student(){
//        Student student = new Student(studentConfig.getName(),studentConfig.getArg());
        return new Student(studentConfig.getName(),studentConfig.getArg(),studentConfig.getHobby());
    }

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        return new Vegetables(vegetablesConfig.getPotato(),vegetablesConfig.getEggplant(),vegetablesConfig.getGreenpeper());
    }

    @RequestMapping("/salad")
    public Salad salad(){
        return new Salad(saladConfig.getBanana(),saladConfig.getApple(),saladConfig.getWatermelon());
    }
}
