package com.springcore.removeXMLfileConfiguration;

import org.springframework.stereotype.Component;

@Component("studentObject") //If we want to create object name as deifned by me then we give object name
public class Student {
    public void Study(){
        System.out.println("Student is reading book");
    }
}
