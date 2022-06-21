package com.backed.mapper;

import com.backed.pojo.Student;

import java.util.List;
//mybatis -->jdbc

public interface StudentMapper {
    //select * from student
    public List<Student> query__();

    public void add(Student student);

    public void delete(Integer id);

    public Student edit(Integer id);

    public void update(Student student);



    public Student login__(Student student);


}
