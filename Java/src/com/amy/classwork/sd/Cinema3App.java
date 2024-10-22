package com.amy.classwork.sd;

import javax.swing.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Cinema3App {
    public static void main(String[] args) {
        int age;
        double cost;
        int numTickets = 0;

        Cinema myC = new Cinema();

        numTickets = Integer.parseInt((JOptionPane.showInputDialog(null,"please enter the number of tickets")));

        for (int i = 0; i <= 1; i++) {
            age = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the age"));

            myC.setAge(age);
            myC.compute();

            cost = myC.getCost();

            JOptionPane.showMessageDialog(null,"For age: " + age + ", the cost is: E" + cost);
        }
    }
}
