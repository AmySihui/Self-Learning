package com.amy.javabasics.Thread_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo05MyThreadPool {
    public static void main(String[] args) {
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
    }
}
