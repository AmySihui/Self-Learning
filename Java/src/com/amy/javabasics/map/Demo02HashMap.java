package com.amy.javabasics.map;

import java.util.HashMap;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo02HashMap {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person(18,"amy"),"beijing");
        map.put(new Person(22,"tom"),"shanghai");
        map.put(new Person(18,"amy"),"guangzhou");
        System.out.println(map);
    }
}
