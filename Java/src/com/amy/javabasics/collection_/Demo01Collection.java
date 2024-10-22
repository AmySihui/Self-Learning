package com.amy.javabasics.collection_;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01Collection {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("tom");
        collection.add("lisa");
        collection.add("susan");
        collection.add("amy");
        collection.add("mark");
        collection.add("jack");

        System.out.println(collection);

        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("xxx");
        collection1.add("yyy");
        collection1.add("zzz");

        collection1.addAll(collection);
        System.out.println(collection1);

        collection1.clear();
        System.out.println(collection1);

        boolean result01 = collection.contains("uuu");
        System.out.println(result01);

        System.out.println(collection1.isEmpty());

        collection.remove("tom");
        System.out.println(collection);

        System.out.println(collection.size());

        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
