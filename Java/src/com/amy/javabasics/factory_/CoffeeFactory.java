package com.amy.javabasics.factory_;

/**
 * @author Amy Wang
 * @version 1.0
 */
abstract class CoffeeFactory {
    public abstract Coffee createCoffee();
}

class EspressoFactory extends CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}

class CappuccinoFactory extends CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new Cappuccino() ;
    }
}