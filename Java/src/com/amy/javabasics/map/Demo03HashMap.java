package com.amy.javabasics.map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo03HashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String date = scanner.next();
        char[] chars = date.toCharArray();
        for (char aChar : chars) {
            String key = aChar + "";
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                Integer value = map.get(key);
                value++;
                map.put(key,value);
            }
        }

    }
}
