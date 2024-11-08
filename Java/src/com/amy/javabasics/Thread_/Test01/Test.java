package com.amy.javabasics.Thread_.Test01;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        t1.setName("小A");
        t2.setName("小BB");
        t3.setName("小OOO");
        t4.setName("小DDD");
        t5.setName("小P");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
