package com.hxci.service.impl;

import com.hxci.mapper.UserMapper;
import com.hxci.pojo.User;
import com.hxci.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;


    public List<User> query() {
        return mapper.query();
    }
}
