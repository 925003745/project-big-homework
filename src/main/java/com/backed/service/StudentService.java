package com.backed.service;

import com.backed.pojo.Student;

import java.util.List;

public interface StudentService {
    public List<Student> query__();
    public void add(Student student);
    public void delete(Integer id);
    public Student edit(Integer id);
    public void update(Student student);


    public Student login__(Student student);

}
