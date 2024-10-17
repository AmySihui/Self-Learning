package com.amy.classwork.sd;

import javax.swing.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class StudentsUnionApp {
    public static void main(String[] args) {
        StudentsUnion studentsUnion = new StudentsUnion();
        String input = JOptionPane.showInputDialog(null,"please enter the quantity of caps: ");
        studentsUnion.setCapsNum(Integer.parseInt(input));
        String input1 = JOptionPane.showInputDialog(null,"please enter the quantity of shirts: ");
        studentsUnion.setShitsNum(Integer.parseInt(input1));
        String input2 = JOptionPane.showInputDialog(null,"please enter the quantity of hoodies: ");
        studentsUnion.setHoodiesNum(Integer.parseInt(input2));

        JOptionPane.showMessageDialog(null, "total price = " + studentsUnion.calculate());

    }
}
