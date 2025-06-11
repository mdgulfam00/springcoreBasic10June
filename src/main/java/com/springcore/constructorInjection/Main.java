package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Person obj =(Person) context.getBean("person");
//        System.out.println(obj);

        solveCIambiguityProblem object = (solveCIambiguityProblem) context.getBean("add");
        object.doSum();
    }
}
