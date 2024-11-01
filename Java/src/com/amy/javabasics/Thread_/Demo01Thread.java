package com.amy.javabasics.Thread_;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01Thread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();*/

       /* MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();*/

        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();

        Integer result = ft.get();
        System.out.println(result);
    }
}
