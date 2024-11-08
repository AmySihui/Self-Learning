package com.amy.javabasics.Thread_.Demo05;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Cook extends Thread{

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师做了面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
