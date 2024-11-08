package com.amy.javabasics.Thread_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Wait {
    public static void main(String[] args) {
        Cook c = new Cook();
        Foodie f = new Foodie();

        c.setName("cooker");
        f.setName("foodie");
        c.start();
        f.start();
    }
}
