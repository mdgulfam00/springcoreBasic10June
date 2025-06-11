package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Emp obj1 = (Emp) context.getBean("employee1");
        System.out.println(obj1);
        System.out.println(obj1.getEmployeeName());
        System.out.println(obj1.getPhones());
        System.out.println(obj1.getAddresses());
        System.out.println(obj1.getCourses());
    }
}
