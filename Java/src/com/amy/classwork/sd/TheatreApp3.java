package com.amy.classwork.sd;

import javax.swing.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class TheatreApp3 {
    public static void main(String[] args) {
        String day, message;
        Theatre3 myT = new Theatre3();
        day = JOptionPane.showInputDialog(null, "Please enter the day");

        myT.setDay(day);
        myT.compute();

        message = myT.getMessage();

        JOptionPane.showMessageDialog(null,"For day: " + day + "," + message);
    }
}
