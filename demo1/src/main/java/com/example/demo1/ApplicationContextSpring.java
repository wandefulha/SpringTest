package com.example.demo1;


import com.example.demo1.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//通过ApplicationContext获取 ApplicationContext extend BeanFactory
public class ApplicationContextSpring {
    public static void main(String args[]){
        //创建容器
        ApplicationContext cls=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //容器取出bean
        UserService userService = (UserService) cls.getBean("userService");
        //使用bean
        System.out.println(userService.getUser(1));
    }
}
