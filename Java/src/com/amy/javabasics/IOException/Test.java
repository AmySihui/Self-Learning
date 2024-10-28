package com.amy.javabasics.IOException;

import javax.swing.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Method02 mm = new Method02();
        String a = JOptionPane.showInputDialog(null, "输入数字a");
        mm.setA(Integer.parseInt(a));

        String b = JOptionPane.showInputDialog(null, "输入数字b");
        mm.setB(Integer.parseInt(b));

        JOptionPane.showMessageDialog(null,mm.calculate());
    }
}

class Method02 {
    private int a;
    private int b;

    public int calculate() {
        return a + b;
    }

    public Method02() {
    }

    public Method02(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}