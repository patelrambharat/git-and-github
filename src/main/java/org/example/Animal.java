package org.example;

public class Animal extends Play{

    int ears = 4;

    public String hello(){
        return "Hello from Animal";
    }

    @Override
    public void walking() {
        System.out.println("I am walking");
    }
}
