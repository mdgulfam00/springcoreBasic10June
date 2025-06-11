package com.springcore.stereoType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")       //It defines the scope of object
public class Student {

    @Value("Md Gulfam")
    private String studentName;

    @Value("Sultanpur")     //to explicitly set the value
    private String city;

    @Value("#{listContent}")    //we will create standalone list in XML file and then inject id of that list in this Collection variable
    private List<String> places;

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", places=" + places +
                '}';
    }
}
