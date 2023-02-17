package com.example.demo2.Service;

import com.example.demo2.domain.User;

public interface AdminService {
    public User getUser(Integer id);
    public UserService getUserService();
}
