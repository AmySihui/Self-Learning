package com.amy.javabasics.collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo06Collections {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("tom", 18));
        list.add(new Person("amy", 23));
        list.add(new Person("lucy", 15));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(list);
    }
}
