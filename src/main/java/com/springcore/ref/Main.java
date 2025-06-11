package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        A obj = (A) context.getBean("aref");
        System.out.println(obj);
        System.out.println("x:"+obj.getX());
        System.out.println("y:"+obj.getOb().getY());
    }
}
