package com.dao;

import com.bean.Personnel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface personnelDAO {

    @Select("select * from personnel")
    List<Personnel> getPersonnel();
}
