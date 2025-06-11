package com.springcore.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Person object = (Person) context.getBean("person1");
        System.out.println(object);
        System.out.println("###########");
        System.out.println(object.getFriends());
        System.out.println(object.getFriends().getClass().getName());
        System.out.println("###########");
        System.out.println(object.getMp());
        System.out.println(object.getMp().getClass().getName());
        System.out.println("###########");
        System.out.println(object.getProperties());
    }
}
