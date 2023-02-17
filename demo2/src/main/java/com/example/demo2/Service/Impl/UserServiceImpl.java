package com.example.demo2.Service.Impl;


import com.example.demo2.Service.AdminService;
import com.example.demo2.Service.UserService;
import com.example.demo2.domain.User;

public class UserServiceImpl implements UserService {
    private AdminService adminService;
    private Integer id;
    public void setAdminService(AdminService adminService){
        this.adminService=adminService;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public UserServiceImpl(){}
    public UserServiceImpl(Integer id){
        System.out.println(id);
    }
    @Override
    public User getUser(Integer id) {
        return new User(id,"hello","olleh");
    }
    public void init(){
        System.out.println("初始化方法");
    }
    public void destroy(){
        System.out.println("销毁方法");
    }
}
