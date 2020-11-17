package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Vehicle v1 = new Yamaha("Red");
        Vehicle v2 = new Simpson("Green");
        Vehicle v3 = new Polonez("White");
        Vehicle v4 = new Ferrari("Yellow");
        v1.drive();
        v2.drive();
        v3.drive();
        v4.drive();
    }
}
