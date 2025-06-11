package com.springcore.March02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student object = context.getBean("student", Student.class);
        System.out.println(object);
        System.out.println("Id: "+object.getId());
        System.out.println("Name: "+object.getName());
        System.out.println("Roll Number: "+object.getRollNumber());
        System.out.println("List of Subjects: "+ object.getSubjects());
        System.out.println("Subject Codes: "+object.getSubjectCode());
        System.out.println("Subject Description: "+object.getSubjectDescription());
    }
}
