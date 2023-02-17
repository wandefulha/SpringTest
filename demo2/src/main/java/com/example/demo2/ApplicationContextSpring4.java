package com.example.demo2;


import com.example.demo2.Service.AdminService;
import com.example.demo2.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//通过ApplicationContext获取 ApplicationContext extend BeanFactory
public class ApplicationContextSpring4 {
    public static void main(String args[]){
        //创建容器
        ApplicationContext cls=new ClassPathXmlApplicationContext("classpath:applicationContext4.xml");
        //容器取出bean
        AdminService adminService = (AdminService) cls.getBean("adminService");
        //执行方法
        System.out.println(adminService.getUserService());
    }
}
