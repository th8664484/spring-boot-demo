package com.demo.service;

import com.demo.bean.Personnel;

import java.util.List;

public interface PersonnelService {

    List<Personnel> persList();

    void add(Personnel personnel);

    Personnel getPers(String name);

    void update(Personnel personnel);

    void datale(String name);
}
