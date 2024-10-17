package com.amy.classwork.sd;

import javax.swing.*;

/**
 * @author Amy Wang
 * @version 1.0
 */

public class TemperatureConversion {
    public static void main(String[] args) {

        double celsius = Double.parseDouble(JOptionPane.showInputDialog("please enter Celsius temperature"));
        double fahrenheit =  (celsius * 9 / 5) + 32;
        JOptionPane.showMessageDialog(null, "Fahrenheit temperature: " + fahrenheit);

    }
}
