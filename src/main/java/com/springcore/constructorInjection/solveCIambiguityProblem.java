package com.springcore.constructorInjection;

public class solveCIambiguityProblem {
    private int a;
    private int b;
    public solveCIambiguityProblem(int a ,int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor: Integer,Integer");
    }
    public solveCIambiguityProblem(double a ,double b){
        this.a= (int) a;
        this.b= (int) b;
        System.out.println("Constructor: Double,Double");
    }

    public void doSum(){
        System.out.println("Sum is:"+(this.a+this.b));
    }

}
