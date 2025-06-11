package com.tut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student obj = (Student) context.getBean("student1");
        System.out.println(obj);
//
//        Student obj2 = (Student) context.getBean("student2");
//        System.out.println(obj2);
//
//        Student obj3= (Student) context.getBean("student3");
//        System.out.println(obj3);
//
//        Student obj4 = (Student) context.getBean("student4");
//        System.out.println(obj4);
    }
}