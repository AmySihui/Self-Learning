package com.amy.javabasics.set_;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
