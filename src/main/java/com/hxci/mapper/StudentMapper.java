package com.hxci.mapper;

import com.hxci.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.List;
//mybatis -->jdbc

public interface StudentMapper {
    //select * from student
    public List<Student> query__();
    public void add(Student student);
    public void delete(Integer sno);
}
