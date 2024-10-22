package com.amy.javabasics.collection_;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo05Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("c.!");
        list1.add("a.hello");
        list1.add("b.world");
        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1);



    }

}
