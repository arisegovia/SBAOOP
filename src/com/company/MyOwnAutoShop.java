package com.company;

import java.text.NumberFormat;

public class MyOwnAutoShop {

    public static void main(String[] args) {

        //Creating instance of Sedan class
        Car sedan = new Sedan(200, 25000, "black", 15);
        System.out.println("The sale price for the sedan is " + NumberFormat.getCurrencyInstance().format(sedan.getSalePrice()));

        //Creating instance of Truck class
        Car truck = new Truck(140, 85000, "white", 4000);
        System.out.println("The sale price for the truck is " + NumberFormat.getCurrencyInstance().format(truck.getSalePrice()));

        //Creating instance of Ford class
        Car ford = new Ford(200, 30000, "white", 2021, 15);
        System.out.println("The sale price for the ford is " + NumberFormat.getCurrencyInstance().format(ford.getSalePrice()));

        //Creating second instance of Ford class
        Car ford2 = new Ford(150, 35000, "red", 2018, 25);
        System.out.println("The sale price for the ford #2 is " + NumberFormat.getCurrencyInstance().format(ford2.getSalePrice()));

        //Creating instance of Car class
        Car car = new Car(120, 40000, "silver") {
            @Override
            public double getSalePrice() {
                return getRegularPrice();
            }
        };
        System.out.println("The sale price for the car is " + NumberFormat.getCurrencyInstance().format(car.getSalePrice()));
    }
}
