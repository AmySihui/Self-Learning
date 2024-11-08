package com.amy.javabasics.Thread_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Desk {
    //控制生产和消费者执行

    public static int foodFlag = 0;

    public static int count = 10;

    public static Object lock = new Object();

}
