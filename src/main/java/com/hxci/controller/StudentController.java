package com.hxci.controller;

import com.alibaba.fastjson.JSONArray;
import com.hxci.pojo.Student;
import com.hxci.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService service__;

    @ResponseBody
    @RequestMapping("query__")

    public String query__(){
        List<Student> list =service__.query__();
        return JSONArray.toJSONString(list);
    }

}
