package com.example.demo2.proessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanFactoryPostProcessor1 implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("已经进入了BeanDefinitionRegistryPostProcessor处理器");
        //创建新的BeanDefinition
        BeanDefinition beanDefinition=new RootBeanDefinition();
        //输入所有的参数并且注册
        beanDefinition.setBeanClassName("com.example.demo2.Service.Impl.UserServiceImpl");
        beanDefinitionRegistry.registerBeanDefinition("userService",beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("已经进入了BeanFactoryPostProcessor处理器");
    }
}
