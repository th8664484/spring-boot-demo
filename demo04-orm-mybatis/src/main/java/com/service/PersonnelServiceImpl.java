package com.service;

import com.bean.Personnel;
import com.dao.personnelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService{

    @Autowired
    private personnelDAO personnelDAO;
    @Override
    public List<Personnel> persList() {
        return personnelDAO.getPersonnel();
    }

}
