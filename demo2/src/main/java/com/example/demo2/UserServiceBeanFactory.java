package com.example.demo2;

import com.example.demo2.Service.Impl.UserServiceImpl;
import com.example.demo2.Service.UserService;

public class UserServiceBeanFactory {
    public static UserService getUserService(Integer id){
        return new UserServiceImpl(id);
    }
    public UserService getUserService1(Integer id){
        return new UserServiceImpl(id);
    }
}
