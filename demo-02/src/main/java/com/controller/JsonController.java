package com.controller;

import com.bean.Student;
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

//    @Autowired
//    private StudentConfig studentConfig ;

    @Value("${student.name}")
    private String name;
    @Value("${student.arg}")
    private Integer arg;

    @RequestMapping("/json")
    public String json(){
        return "Hello JSON";
    }

    @RequestMapping("/student")
    public Student student(){
//        Student student = new Student(studentConfig.getName(),studentConfig.getArg());
        return new Student(name,arg);
    }
}
