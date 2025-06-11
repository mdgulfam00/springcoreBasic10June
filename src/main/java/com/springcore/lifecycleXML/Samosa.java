package com.springcore.lifecycleXML;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting property.....");
        this.price = price;
    }
    public Samosa(){
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void init(){             // init() name of method can be change by developer but modifier and return type must be same
        System.out.println("Inside init method...");
    }
    public void destroy(){      // destroy() name of method can be change by developer but modifier and return type must be same
        System.out.println("Inside destroy method....");
    }
    //But destroy method aise asani se call nhi hota hai...
    //At this stage when we try to run Bean then setting property and init() will be called
    //If we wan to call destroy() method then we must use AbstractApplicationContext object and call for registerShutDownHook() method
}
