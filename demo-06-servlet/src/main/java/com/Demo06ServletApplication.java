package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Demo06ServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo06ServletApplication.class, args);
    }

}
