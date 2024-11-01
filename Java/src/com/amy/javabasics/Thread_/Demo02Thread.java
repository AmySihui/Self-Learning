package com.amy.javabasics.Thread_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo02Thread {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();

        t.setName("土豆");
        t.start();
        t.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main" + i);
        }
    }
}
