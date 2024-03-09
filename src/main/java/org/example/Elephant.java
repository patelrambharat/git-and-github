package org.example;

public class Elephant implements DailyLife{

    int ears = 6;

    public String hello(){
        return "Hello from Elephant";
    }

    @Override
    public void eat(int a) {
        System.out.println("I am eating");
    }
}
