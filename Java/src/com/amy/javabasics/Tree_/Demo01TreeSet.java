package com.amy.javabasics.Tree_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01TreeSet {
    public static void main(String[] args) {
        TreeSet<Person> set1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();//asc
            }
        });
        set1.add(new Person("amy",12));
        set1.add(new Person("tom",8));
        set1.add(new Person("susan",30));

        System.out.println(set1);
    }
}
