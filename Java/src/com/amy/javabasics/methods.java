package com.amy.javabasics;

import static com.amy.javabasics.printMessages.print;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class methods {
    public static void main(String[] args) {
        print("message: ", "hello", "world", "123");
    }
}

class Calculator {
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}

class printMessages {
    public static void print(String prefix, String... messages) {
        for (String message: messages) {
            System.out.println(prefix + message);
        }
}

}

