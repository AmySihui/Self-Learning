package com.amy.classwork.sd;

import javax.swing.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class TheatreApp2 {
    public static void main(String[] args) {
        /*int age = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter your age: "));
        int day = Integer.parseInt(JOptionPane.showInputDialog(null, "please choose your date: \n" +
                "1 : Mon- Thur\n" + "2: Fri-Sun\n" + "enter the num(like 1)"));
        if (day == 1 && (age < 10 || age > 65)) {
            JOptionPane.showMessageDialog(null, "Cost is Free!");
        } else {
            JOptionPane.showMessageDialog(null, "Cost is 10 euro!");
        }

        if (day == 2) {
            if (age < 10) {
                JOptionPane.showMessageDialog(null, "Cost is 20 euro!");
            }
            if (age > 10 && age < 65) {
                JOptionPane.showMessageDialog(null,"Cost is 30 euro!");
            }
            if (age > 65) {
                JOptionPane.showMessageDialog(null,"Cost is 10 euro!");
            }
        }*/

        int age;
        String day, message = "";

        day = JOptionPane.showInputDialog(null, "please enter your day");
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter your age"));

        if (day.equalsIgnoreCase("Mon") || day.equalsIgnoreCase("Tue") ||
                day.equalsIgnoreCase("Wed") || day.equalsIgnoreCase("Thur")) {
            if (age < 10 || age > 65) {
                message = "...ticket is Free";
            } else  {
                message = "...ticket costs E10";
            }
        } else if (day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            if (age < 10) {
                message = "...ticket costs E20";
            } else if (age <=55) {
                message = "...ticket costs E30";
            } else {
                message = "...ticket costs E10";
            }
        }

        JOptionPane.showMessageDialog(null,message);
    }
}
