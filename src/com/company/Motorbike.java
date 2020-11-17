package com.company;

public abstract class Motorbike extends Vehicle {

    private static final int NUMBER_OF_WHEELS =2; //MEMBER OF EVERY OBJECT INSTATIATED FOR THIS CLASS

    public Motorbike (String color, int maxSpeed) {
        super(NUMBER_OF_WHEELS, color, maxSpeed);  // ctrl i klik - pokazuje miejsce
        //init motorbike
    }
}
