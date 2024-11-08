package com.amy.javabasics.Thread_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}
