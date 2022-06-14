package com.hxci.service;

import com.hxci.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> query();
    public void add(User user);
    public void delete(Integer id);
}
