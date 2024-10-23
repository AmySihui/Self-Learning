package com.amy.javabasics.List_in_List;

import java.util.ArrayList;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class ListInList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("amy");
        list1.add("jack");
        list1.add("mary");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");

        ArrayList<ArrayList<String>> list3 = new ArrayList<>();
        list3.add(list1);
        list3.add(list2);
        System.out.println(list3);

        for (ArrayList<String> strings : list3) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
        }
    }
}
