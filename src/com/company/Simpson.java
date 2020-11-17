package com.company;

public class Simpson extends Motorbike {

    static private final int MAX_SPEED = 200;

    public Simpson (String color) {
        super(color, MAX_SPEED);
    }

    public void drive() {
        System.out.println("Simpson colored: " + getColor()+" is driving with "+getMaxSpeed()+"km/h.");
    }
}
