package com.amy.javabasics.Thread_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo04Thread {
    public static void main(String[] args) {
        MyRun2 mr = new MyRun2();
        Thread t1 = new Thread(mr,"窗口1");
        Thread t2 = new Thread(mr,"窗口2");
        Thread t3 = new Thread(mr,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
