package com.amy.javabasics;

/**
 * @author Amy Wang
 * @version 1.0
 */
public interface USB {
    public abstract void open();
    public abstract void close();

    public static void methodSta() {
        System.out.println("Static method");
    }

    public static final int num = 1;

}
