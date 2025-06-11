package com.springcore.lifecycleInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting property.....");
        this.price = price;
    }
    public Pepsi(){
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //that means this code is of init()
        System.out.println("Taking Pepsi....");
    }

    @Override
    public void destroy() throws Exception {
        //destroy pr chlega
        System.out.println("Going to put bottle in shop....");
    }
}
