package com.springcore.lifecycleInterfaces;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Pepsi object = (Pepsi) context.getBean("p1");
        System.out.println(object);
        context.registerShutdownHook();
    }
}
