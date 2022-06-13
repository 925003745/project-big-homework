package com.hxci.controller;


import com.alibaba.fastjson.JSONArray;
import com.hxci.mapper.UserMapper;
import com.hxci.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
//spring mvc --->servlet   通过一个地址url找到一个后台方法
@Controller
@RequestMapping("user")
public class UserController {
    //http://localhost:8081/demo_zc/user/query
    @Autowired
    UserMapper mapper;

    @ResponseBody
    @RequestMapping("query")
    public String query(){
        List<User> list =mapper.query();
        return JSONArray.toJSONString(list);
    }
}
