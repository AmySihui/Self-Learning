package com.amy.javabasics.set_;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo02LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("bbb");
        set2.add("ddd");
        set2.add("fff");
        set2.add("ggg");
        System.out.println(set2);

        Iterator<String> iterator = set2.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
