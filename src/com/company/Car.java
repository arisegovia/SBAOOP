package com.company;

public abstract class Car {
    //fields
    private int speed;
    private double regularPrice;
    private String color;

    //constructors
    public Car() {
    }

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    //methods
    public abstract double getSalePrice();

    //getters and setters
        public double getRegularPrice() {
        return regularPrice;
    }
}
