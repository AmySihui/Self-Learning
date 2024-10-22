package com.amy.javabasics.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo03Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("tt");
        list.add("zz");
        list.add("bb");

        ArrayList<String> list1 = new ArrayList<>();

        Iterator<String> iterator = list.iterator();
        /*while (iterator.hasNext()) {
            String next = iterator.next();
            if ("tt".equals(next)) {
                list.add("nn");
            }
        }*/

        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("tt".equals(next)) {
                list1.add("tt");
            }
        }
        list.addAll(list1);
        System.out.println(list);
    }
}
