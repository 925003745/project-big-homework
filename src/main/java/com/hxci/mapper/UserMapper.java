package com.hxci.mapper;

import com.hxci.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;
//mybatis -->jdbc

public interface UserMapper {
    //select * from user
    public List<User> query();

    public void add(User user);
    public void delete(Integer id);
    void update(User user);
}
