package com.amy.javabasics.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo04Poker {
    public static void main(String[] args) {
        String[] color = "♠-♥-♦-♣".split("-");
        String[] number = "2-3-4-5-6-7-8-9-10-J-Q-K-A".split("-");
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        int key = 2;
        for (String num : number) {
            for (String huaSe : color) {
                String pokerNumber = huaSe + num;
                poker.put(key, pokerNumber);
                list.add(key);
                key++;
            }
        }

        poker.put(0, "大🃏");
        poker.put(1, "小🃏");

        System.out.println(list);
        System.out.println(poker);

        Collections.shuffle(list);

        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> under = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer key1 = list.get(i);
            if (i >= 51) {
                under.add(key1);
            } else if (i % 3 == 0) {
                p1.add(key1);
            } else if (i % 3 == 1) {
                p2.add(key1);
            } else if (i % 3 == 2) {
                p3.add(key1);
            }
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(under);

        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(under);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(under);

        lookPoker("amy",p1,poker);
        lookPoker("john",p2,poker);
        lookPoker("mary",p3,poker);
        lookPoker("susan",under,poker);

    }

    private static void lookPoker(String name, ArrayList<Integer> list, HashMap<Integer, String> map) {
        System.out.print(name + ":");
        for (Integer key : list) {
            String value = map.get(key);
            System.out.print(value + " ");
        }

        System.out.println();
    }
}
