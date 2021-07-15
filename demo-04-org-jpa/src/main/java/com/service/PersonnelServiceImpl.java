package com.service;

import com.bean.Personnel;
import com.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService{

    @Autowired
    private PersonnelRepository repository;
    @Override
    public List<Personnel> persList() {
        return repository.findAll();
    }

}
