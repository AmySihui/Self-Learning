package com.amy.classwork.sd;

import java.util.Scanner;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class TheatreApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter day: ");
        String day = scanner.nextLine();
        day = day.toLowerCase();
        if (day.equals("Mon") || day.equals("Tue") ||day.equals("Wed") || day.equals("Thur")) {
            System.out.println("10");
        }
    }
}
