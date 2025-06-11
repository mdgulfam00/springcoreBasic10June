package com.springcore.lifecycleAnnotations;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        System.out.println("Setting properties...");
        this.subject = subject;
    }
    public Example(){
        super();
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct//init
    public void start(){
        System.out.println("Starting method...");
    }

    @PreDestroy//destroy
    public void end(){
        System.out.println("Ho gyaa...");
        System.out.println("Ending Mehtod...");
    }
}
