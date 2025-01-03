package com.amy.javabasics.Thread_;

import java.util.concurrent.Callable;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}
