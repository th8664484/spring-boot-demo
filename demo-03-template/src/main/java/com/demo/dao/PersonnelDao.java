package com.demo.dao;

import com.demo.bean.Personnel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonnelDao {
    private static List<Personnel> personnels = new ArrayList<>();
    static {
        personnels.add(new Personnel("仝辉","矿主"));
        personnels.add(new Personnel("杨晨","矿工"));
        personnels.add(new Personnel("戴言","矿工"));
        personnels.add(new Personnel("杜学永","矿工"));
        personnels.add(new Personnel("陈少华","矿工"));
        personnels.add(new Personnel("侯堃","矿工"));
    }

    public List<Personnel> persList(){
        return personnels;
    }

    public void add(Personnel personnel){
        personnels.add(personnel);
    }

    public Personnel getPers(String name){
        for(Personnel p:personnels){
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public void update(Personnel personnel){
        Personnel p = getPers(personnel.getName());
        if (p!=null){
            p.setPosition(personnel.getPosition());
        }
    }

    public void datale(String name){
        Personnel p = getPers(name);
        if (p!=null){
            personnels.remove(p);
        }
    }


}
