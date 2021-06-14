package com.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="student")
@Data
public class StudentConfig {
    private String name;
    private Integer arg;
    private String[] hobby;

//    public StudentConfig() {
//    }
//
//    public StudentConfig(String name, Integer arg) {
//        this.name = name;
//        this.arg = arg;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getArg() {
//        return arg;
//    }
//
//    public void setArg(Integer arg) {
//        this.arg = arg;
//    }
}
