package org.example;

import org.example.mapper.HelloMapper;
import org.example.domain.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HelloMapper helloMapper=applicationContext.getBean(HelloMapper.class);
        List<Hello> all=helloMapper.getHellos();
        System.out.println(all.get(0));
    }
}
