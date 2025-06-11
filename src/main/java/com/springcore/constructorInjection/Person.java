package com.springcore.constructorInjection;

public class Person {
    private String name;
    private int personId;

     public Person(String name,int personId){
         System.out.println("From constructor...");
         this.name=name;
         this.personId=personId;
     }

    @Override
    public String toString() {
        return "Name:-"+ this.name+" : "+"Age:-"+this.personId;
    }
}
