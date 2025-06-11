package com.springcore.Feb28;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.Feb28.Employee;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee obj = context.getBean("employee", Employee.class);
        System.out.println(obj);
    }

}
