package com.hxci.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
    @RequestMapping(value="login__", produces = "text/html; charset=utf-8")
    public String login(Student student){
        Student $ = service__.login__(student);
        if ($ != null){
            return "Y";
        }
        return "N";
    }


    @ResponseBody
    @RequestMapping(value="query__", produces = "text/html; charset=utf-8")
    public String query__(){
        List<Student> list =service__.query__();
        return JSONArray.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping("add")
    public String add(Student student){
        service__.add(student);
        return "1";}

    @ResponseBody
    @RequestMapping("delete")
    public String delete(Integer id){
        service__.delete(id);
        return "1";
    }

    @ResponseBody
    @RequestMapping("edit")
    public String edit(Integer id){
        Student student = service__.edit(id);
        return JSONObject.toJSONString(student);
    }

    @ResponseBody
    @RequestMapping("update")
    public String update(Student student){
        service__.update(student);
        return "1";
    }
}
