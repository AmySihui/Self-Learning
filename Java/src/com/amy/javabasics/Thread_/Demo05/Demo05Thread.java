package com.amy.javabasics.Thread_.Demo05;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo05Thread {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);

        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        c.start();
        f.start();
    }
}
