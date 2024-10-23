package com.amy.javabasics.Tree_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo02TreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> map1 = new TreeMap<>();
        map1.put("c", "bmfls");
        map1.put("a", "aaa");
        map1.put("b", "qxxtg");
        map1.put("d", "hzbqb");
        System.out.println(map1);

        System.out.println("==================");
        TreeMap<Person, String> map2 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        map2.put(new Person("amy",12),"beijing");
        map2.put(new Person("tom",8),"beijing");
        map2.put(new Person("susan",30),"beijing");

        System.out.println(map2);
    }
}
