package com.example.demo2;

import com.example.demo2.Service.Impl.UserServiceImpl;
import com.example.demo2.Service.UserService;
import org.springframework.beans.factory.FactoryBean;

public class UserServiceFactoryBean implements FactoryBean<UserService> {

    @Override
    public UserService getObject() throws Exception {
        return new UserServiceImpl(1);
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }
}
