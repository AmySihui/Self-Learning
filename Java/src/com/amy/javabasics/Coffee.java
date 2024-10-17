package com.amy.javabasics;

/**
 * @author Amy Wang
 * @version 1.0
 */
abstract class Coffee {
    public abstract String getName();
}

class Espresso extends Coffee {
    public String getName() {
        return "Espresso";
    }
}

class Cappuccino extends Coffee {
    @Override
    public String getName() {
        return "Cappuccino";
    }
}

