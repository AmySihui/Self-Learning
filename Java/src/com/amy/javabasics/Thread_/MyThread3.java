package com.amy.javabasics.Thread_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class MyThread3 extends Thread{

    static int ticket = 0;

    @Override
    public void run() {
        while (true) {
           synchronized (MyThread3.class) {
               if (ticket < 1000) {
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   ticket++;
                   System.out.println(getName() + "正在卖第" + ticket + "张票！！！");
               } else {
                   break;
               }
           }
        }
    }
}
