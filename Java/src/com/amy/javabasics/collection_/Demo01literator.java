package com.amy.javabasics.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01literator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("tesco");
        list.add("lidl");
        list.add("dunnes");
        list.add("ms");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
