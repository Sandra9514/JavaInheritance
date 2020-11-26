package com.company;

import java.util.*;

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
        
        
        listCar();
        setCar();
        sortedSetCar();
    }

    private static void sortedSetCar() {
        System.out.println("---Sorted Set Car---");
        SortedSet<String> cars = new TreeSet<>();
        cars.add("Polonez");
        cars.add("Ferrari");
        cars.forEach(System.out::println);
    }

    private static void setCar() {
        System.out.println("---Set Car---");
        HashSet<String> cars = new HashSet<>();
        cars.add("Polonez");
        cars.add("Ferrari");
        cars.forEach(System.out::println);
    }

    private static void listCar() {
        System.out.println("---List Car---");
        List<String> cars = new LinkedList<>();
        cars.add("Polonez");
        cars.add("Ferrari");
        cars.forEach(System.out::println);
    }
}
