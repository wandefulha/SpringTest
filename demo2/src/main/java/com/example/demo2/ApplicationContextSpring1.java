package com.example.demo2;


import com.example.demo2.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//通过ApplicationContext获取 ApplicationContext extend BeanFactory
public class ApplicationContextSpring1 {
    public static void main(String args[]){
        //创建容器
        ApplicationContext cls=new ClassPathXmlApplicationContext("classpath:applicationContext1.xml");
        //容器取出bean
        UserService singleton = (UserService) cls.getBean("wwww1");
        UserService singleton1 = (UserService) cls.getBean("wwww1");
        System.out.println(singleton1+":"+singleton);
    }
}
