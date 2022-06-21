package com.backed.service.impl;

import com.backed.mapper.StudentMapper;
import com.backed.pojo.Student;
import com.backed.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired(required = false)
    StudentMapper mapper__;

    public List<Student> query__() {
        return mapper__.query__();
    }

    @Override
    public Student login__(Student student){
        return mapper__.login__(student);
    }


    @Override
    public void add(Student student) {
        mapper__.add(student);
    }
    @Override
    public void delete(Integer id) {
        mapper__.delete(id);
    }
    @Override
    public Student edit(Integer id) {
        return mapper__.edit(id);
    }

    @Override
    public void update(Student student) {
        mapper__.update(student);
    }

}
