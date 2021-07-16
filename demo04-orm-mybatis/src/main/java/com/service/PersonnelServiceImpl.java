package com.service;

import com.bean.Personnel;
import com.dao.personnelDAO;
import com.tk.mapper.TKPersonnelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService{

//    @Autowired
//    private personnelDAO personnelDAO;
    @Autowired
    private TKPersonnelMapper personnelMapper;
    @Override
    public List<Personnel> persList() {
        return personnelMapper.selectAll();
    }

}
