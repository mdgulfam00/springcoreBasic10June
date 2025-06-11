package com.springcore.autowireXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Employee object =  context.getBean("emp1", Employee.class);
//        System.out.println(object);

//          By Name -> check for refrence variable named bean declared
//            By Type -> spring find krega us bean ko jo us class type ka ho
//            By Constructor -> check for constructor


//        Employee object2 =  context.getBean("emp2", Employee.class);
//        System.out.println(object2);

        Employee object2 =  context.getBean("emp3", Employee.class);
        System.out.println(object2);
    }
}
