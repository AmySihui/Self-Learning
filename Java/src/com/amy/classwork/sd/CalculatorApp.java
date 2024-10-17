package com.amy.classwork.sd;

import java.util.Scanner;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please add two number");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("please choose one option(enter: 1)");
        System.out.println("1 to add the two numbers\n" +
                "2 to subtract the two numbers\n" +
                "3 to multiply the two numbers \n" +
                "4 to divide the first number by the second number\n");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
        }
    }
}
