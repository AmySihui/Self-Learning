package com.amy.javabasics.factory_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class CoffeeShop {
    public static void main(String[] args) {
        EspressoFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        System.out.println("Order a " + espresso.getName());

        CappuccinoFactory cappuccinoFactory = new CappuccinoFactory();
        Coffee cappuccino = cappuccinoFactory.createCoffee();
        System.out.println("Order a " + cappuccino.getName());
    }
}
