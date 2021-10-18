package com.company;

public class Ford extends Car{
    //fields
    private int year;
    private int manufacturerDiscount; //Discount given in percentage

    //constructors
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    //methods
    @Override
    public double getSalePrice() {
        return getRegularPrice() - (getRegularPrice() * ((manufacturerDiscount / 100D)));
    }
}
