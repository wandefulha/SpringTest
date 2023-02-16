package com.example.demo2.proessor;

import com.example.demo2.Service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        //获取beanDefinition
        BeanDefinition wwww1 = configurableListableBeanFactory.getBeanDefinition("userService");
        //设置为原型模式
        wwww1.setScope("prototype");
        System.out.println("已经进入了BeanFactoryPostProcessor处理器");
    }
}
