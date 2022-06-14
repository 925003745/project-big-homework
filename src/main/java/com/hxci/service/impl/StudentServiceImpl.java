package com.hxci.service.impl;

import com.hxci.mapper.StudentMapper;
import com.hxci.pojo.Student;
import com.hxci.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper mapper__;

    public List<Student> query__() {
        return mapper__.query__();
    }
    @Override
    public void add(Student student) {mapper__.add(student);}
    @Override
    public void delete(Integer sno) {
        mapper__.delete(sno);
    }
}
