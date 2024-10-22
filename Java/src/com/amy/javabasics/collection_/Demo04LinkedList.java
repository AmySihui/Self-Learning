package com.amy.javabasics.collection_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo04LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("tom");
        linkedList.add("susan");
        linkedList.add("john");
        linkedList.add("lucy");

        linkedList.pop();
        System.out.println(linkedList);
        for (String s : linkedList) {
            System.out.println(s);
        }

        linkedList.push("yyy");
        System.out.println(linkedList);

        linkedList.addFirst("fff");
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
