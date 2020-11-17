package com.company;

public class Ferrari extends Car {

    private static final int MAX_SPEED = 355;

    public Ferrari (String color) {
        super(color, MAX_SPEED);
    }

    public void drive() {
        System.out.println("Ferrari colored: " + getColor()+" is driving with "+getMaxSpeed()+"km/h.");
    }


}
