package com.amy.javabasics.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("aa", "zz");
        map.put("bb", "yy");
        map.put("cc", "xx");

        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + "-" + map.get(key));
        }

        Set<Map.Entry<String, String>> set1 = map.entrySet();
        for (Map.Entry<String, String> entry : set1) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);

        }
    }
}
