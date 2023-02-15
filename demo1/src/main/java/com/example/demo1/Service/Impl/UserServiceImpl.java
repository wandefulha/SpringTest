package com.example.demo1.Service.Impl;

import com.example.demo1.Service.UserService;
import com.example.demo1.domain.User;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(Integer id) {
        return new User(id,"hello","olleh");
    }
}
