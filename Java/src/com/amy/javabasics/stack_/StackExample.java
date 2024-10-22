package com.amy.javabasics.stack_;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        int topElement = stack.pop();
        System.out.println(topElement);

        int peekElement = stack.peek();
        System.out.println(peekElement);

       Queue<Integer> queue = new LinkedList<>();

       queue.offer(10);
       queue.offer(20);
       queue.offer(30);

       int poll = queue.poll();
       int peek = queue.peek();



    }
}
