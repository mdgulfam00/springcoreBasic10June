package com.springcore.lifecycleAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Example object = (Example) context.getBean("example");
        System.out.println(object);

        context.close(); //This is required for running destructor...
    }
}
