package com.example.demo2;


import com.example.demo2.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//通过ApplicationContext获取 ApplicationContext extend BeanFactory
public class ApplicationContextSpring3 {
    public static void main(String args[]){
        //创建容器
        ApplicationContext cls=new ClassPathXmlApplicationContext("classpath:applicationContext3.xml");
        //容器取出bean
        UserService userService = (UserService) cls.getBean("userService");
        //执行方法
        userService.getUser(1);
    }
}
