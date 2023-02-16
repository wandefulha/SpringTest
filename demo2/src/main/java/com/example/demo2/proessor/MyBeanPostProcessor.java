package com.example.demo2.proessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;


public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean前处理");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean后处理");
        Object proxyB= Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args)->{
                    System.out.println(new Date());
                    Object ret=method.invoke(bean,args);
                    return ret;
                });
        return proxyB;
    }
}
