package com.amy.javabasics.Thread_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Cook extends Thread{
    @Override
    public void run() {
        /*1. 循环
         * 2. 同步代码块
         * 3. 判断是否到末尾，到末尾
         * 4. 没有到末尾
         * */

        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(getName() + "正在做");
                        Desk.foodFlag = 1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
