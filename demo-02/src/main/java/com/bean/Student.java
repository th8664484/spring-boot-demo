package com.bean;

public class Student {
    private String name;
    private Integer arg;

    public Student(String name, Integer arg) {
        this.name = name;
        this.arg = arg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArg() {
        return arg;
    }

    public void setArg(Integer arg) {
        this.arg = arg;
    }
}
