package com.hxci.mapper;

import com.hxci.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.List;
//mybatis -->jdbc

public interface StudentMapper {
    //select * from student
    public List<Student> query__();
}
