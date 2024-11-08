package com.amy.javabasics.Thread_.Test01;

import java.util.Random;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class MyThread extends Thread {
    static double money = 100;
    static int count = 4;
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println(getName() + "没有抢到！");
            } else {
                double prize = 0;
                if (count == 1) {
                    prize = money;
                } else {
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                    prize = r.nextDouble(bounds);
                    if (prize < MIN) {
                        prize = MIN;
                    }
                }
                money -= prize;
                count--;
                System.out.println(getName() + "抢到了" + prize + "元！");
            }

        }
    }
}
