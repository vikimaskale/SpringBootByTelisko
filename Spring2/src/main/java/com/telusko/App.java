package com.telusko;

import com.telusko.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main( String[] args ){
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj1= context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();
    }
}


