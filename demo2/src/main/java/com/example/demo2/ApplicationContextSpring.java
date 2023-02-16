package com.example.demo2;


import com.example.demo2.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//通过ApplicationContext获取 ApplicationContext extend BeanFactory
public class ApplicationContextSpring {
    public static void main(String args[]){
        //创建容器
        ApplicationContext cls=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //容器取出bean
//        UserService userService = (UserService) cls.getBean("userService");
//        UserService userService = (UserService) cls.getBean("com.example.demo2.Service.Impl.UserServiceImpl");
        UserService singleton = (UserService) cls.getBean("wwww1");
//        UserService singleton1 = (UserService) cls.getBean("wwww1");
//        UserService prototype = (UserService) cls.getBean("wwww");
//        UserService prototype1 = (UserService) cls.getBean("wwww");
        //使用bean
        System.out.println(singleton.getUser(1));
        ((ClassPathXmlApplicationContext) cls).close();
//        System.out.println(singleton1.getUser(1));
//        System.out.println("____________________");
//        System.out.println(prototype);
//        System.out.println(prototype1);
    }
}
