package com.amy.javabasics.Thread_.Test02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class MyThread extends Thread {
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    break;
                } else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    System.out.println(getName() + "产生大奖" + prize + "元");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
