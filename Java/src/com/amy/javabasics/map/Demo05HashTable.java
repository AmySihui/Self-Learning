package com.amy.javabasics.map;

import java.util.HashMap;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo05HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(5,0.75f);
        map.put("abc", "1");
        map.put("通话", "2");
    }
}
