package com.company;

public class Sedan extends Car{
    //fields
    private int length;

    //constructors
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    //methods
    @Override
    public double getSalePrice() {
        if (length > 20){
            return getRegularPrice() * 0.95D;
        } else {
            return getRegularPrice() * 0.9D;
        }
    }
}
