package com.company;

public class Truck extends Car {
    //fields
    private int weight;

    //constructors
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    //methods
    @Override
    public double getSalePrice() {
        if (weight > 2000){
            return getRegularPrice() * 0.9D;
        } else {
            return getRegularPrice() * 0.8D;
        }
    }
}
