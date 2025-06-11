package com.springcore.homeWork26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       BookServiceImpl object = context.getBean("bookService",BookServiceImpl.class);
       object.display();

       Book getBook = object.getBookByIsbn("749293828464");
        System.out.println(getBook);
    }
}
