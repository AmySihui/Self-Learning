package com.amy.classwork.sd;

import java.util.Scanner;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class CinemaApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter age: ");
        int age = scanner.nextInt();
        if (age < 14) {
            System.out.println("15");
        } else {
            System.out.println("30");
        }
    }

}
