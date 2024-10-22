package com.amy.classwork.sd;

import javax.swing.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Cinema5App {
    public static void main(String[] args) {
        int age;
        double cost;
        int ticketNum;

        Cinema myC = new Cinema();

        ticketNum = Integer.parseInt(JOptionPane.showInputDialog(null, "how many ticket do you want?"));

        do {
            age = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the age"));
            myC.setAge(age);
            myC.compute();

            ticketNum--;

        } while (ticketNum > 0);

        myC.setAge(age);
        myC.compute();

        cost = myC.getCost();
        JOptionPane.showMessageDialog(null, "For age: " + age + ", the cost is: E" + cost);


    }
}
