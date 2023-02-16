package com.example.demo2;


import com.example.demo2.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//通过ApplicationContext获取 ApplicationContext extend BeanFactory
public class ApplicationContextSpring2 {
    public static void main(String args[]){
        //创建容器
        ApplicationContext cls=new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
        //容器取出bean
        UserService userService = (UserService) cls.getBean("userService");
        System.out.println(userService);
    }
}
