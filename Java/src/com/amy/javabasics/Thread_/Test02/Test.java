package com.amy.javabasics.Thread_.Test02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();
    }
}
