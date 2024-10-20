package com.amy.javabasics;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.open();
        mouse.close();

        USB.methodSta();

        int num = USB.num;
    }
}
