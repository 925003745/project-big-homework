package com.hxci.controller;


import com.alibaba.fastjson.JSONArray;
import com.hxci.mapper.UserMapper;
import com.hxci.pojo.User;
import com.hxci.service.UserService;
import com.hxci.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
//spring mvc --->servlet   通过一个地址url找到一个后台方法
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService service;

    @ResponseBody
    @RequestMapping("query")
    public String query(){
        List<User> list =service.query();
        return JSONArray.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping("add")
    public String add(User user){
        service.add(user);
        return "1";
    }

    @ResponseBody
    @RequestMapping("delete")
    public String delete(Integer id){
        service.delete(id);
        return "1";
    }

}
