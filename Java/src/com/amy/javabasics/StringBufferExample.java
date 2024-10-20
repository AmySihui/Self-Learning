package com.amy.javabasics;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        sb.insert(5,",");
        sb.replace(6,12,"java");
        sb.delete(5,6);
        sb.reverse();

        StringBuilder sbd = new StringBuilder();
        sbd.append("worldddd");
    }
}
