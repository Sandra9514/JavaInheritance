package com.company;

public class Polonez extends Car {

    private static final int MAX_SPEED = 220;

    public Polonez (String color) {
        super(color, MAX_SPEED);
    }

    public void drive() {
        System.out.println("Polonez colored: " + getColor()+" is driving with "+getMaxSpeed()+"km/h.");
    }


}
