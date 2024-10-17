package com.amy.classwork.sd;

import java.util.Scanner;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class CinamaApp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter age: ");
        int age = scanner.nextInt();
        if (age < 5) {
            System.out.println("free");
        } else if (age <= 14) {
            System.out.println("5");
        } else if (age <=65) {
            System.out.println("10");
        } else {
            System.out.println("free");
        }
    }
}
