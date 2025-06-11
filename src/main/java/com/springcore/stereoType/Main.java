package com.springcore.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student object = context.getBean("student",Student.class);
        //Object hmesha camel case ko follow krte hue banayega same as that of class name which is declared as @Component
        System.out.println(object);

        //To check singleton property we create two object and compare
        //Hm scope ko declare krte hai above the class name
        Student obj1 = context.getBean("student",Student.class);
        Student obj2 = context.getBean("student", Student.class);
        System.out.println("Both the objecte are equal?: ");
        System.out.println(obj1==obj2);

        //To check prototype property
//        Student object1 = context.getBean("student",Student.class);
//        Student object2 = context.getBean("student", Student.class);
//        System.out.println("Both the objecte are equal?: ");
//        System.out.println(object1==object2);
    }
}
