package com.hxci.service.impl;


import com.hxci.mapper.UserMapper;
import com.hxci.pojo.User;
import com.hxci.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserMapper mapper;


    public List<User> query() {
        return mapper.query();
    }

    @Override
    public void add(User user) {
        mapper.add(user);
    }

    @Override
    public void delete(Integer id) {
        mapper.delete(id);
    }

    @Override
    public void update(User user) {
        mapper.update(user) ;
    }
}
