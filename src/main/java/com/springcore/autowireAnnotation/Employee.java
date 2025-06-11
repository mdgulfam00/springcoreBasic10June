package com.springcore.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Employee {
    @Autowired      //Use On property to set values in it -> By default ye autowire="By Type" hota hai i.e. class type ki help se bean find krta hai
    //@Qualifier("address")  //It is used when we found 2 or more beans of same class type
    private Address address;

    public Address getAddress() {
        return address;
    }
    //@Autowired      //On setter -> By default ye autowire="By name" hota hai i.e. jo setter ke argument me name pass kiye hai usi name se ye bean find krega
    public void setAddress(Address address) {
        System.out.println("In setter...");
        this.address = address;
    }
    public Employee(){
        super();
    }
   //@Autowired      //On constructor -> By default ye autowire="By constructor" hota hai
    public Employee(Address address){
        super();
        this.address=address;
        System.out.println("Inside Constructor...");
    }

    @Override
    public String toString() {
        return "Address:"+address;
    }
}
