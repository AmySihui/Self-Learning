package com.amy.classwork.sd;

import javax.swing.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Cinema4 {
    public static void main(String[] args) {
        int age;
        double cost;
        String moreTickets;
        int i = 1;

        Cinema myC = new Cinema();

        do {
            age = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the age for person" + i));

            myC.setAge(age);
            myC.compute();

            cost = myC.getCost();

            JOptionPane.showMessageDialog(null,"For age: " + age + ", the cost is: E" + cost);
            i++;
            moreTickets = JOptionPane.showInputDialog(null,"do you require more Tickets, Yes or No");
        } while (moreTickets.equals("Yes"));

    }
}
