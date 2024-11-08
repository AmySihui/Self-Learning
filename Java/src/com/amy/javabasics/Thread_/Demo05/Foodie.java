package com.amy.javabasics.Thread_.Demo05;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
