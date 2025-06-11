package com.springcore.SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{5+3}")    //Spring Expression language
    private int x;

    @Value("#{5<2?10:20}")      //Spring Expression language..... We can inject any expression that return something
    private int y;

    @Value("#{T(java.lang.Math).sqrt(36)}")
    private double z;           //Suppose i want to store sqrt(Static method hai) of 36 in z

    @Value("#{T(java.lang.Math).PI}")
    private double a;   //Suppose I want to store value of PI(Static variable hai) in a

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", a=" + a +
                '}';
    }
}
