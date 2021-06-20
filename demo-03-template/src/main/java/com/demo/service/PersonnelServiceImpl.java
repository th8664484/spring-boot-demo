package com.demo.service;

import com.demo.bean.Personnel;
import com.demo.dao.PersonnelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService{

    @Autowired
    private PersonnelDao persDao;
    @Override
    public List<Personnel> persList() {
        return persDao.persList();
    }

    @Override
    public void add(Personnel personnel) {
        persDao.add(personnel);
    }

    @Override
    public Personnel getPers(String name) {
        return persDao.getPers(name);
    }

    public void update(Personnel personnel){
        persDao.update(personnel);
    }

    public void datale(String name){
        persDao.datale(name);
    }
}
