package com.amy.javabasics.testPa;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("Java\\src\\com\\amy\\javabasics\\testPa\\names.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            Student stu = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            list.add(stu);

        }
        br.close();

        double weight = 0;
        for (Student stu : list) {
            weight += stu.getWeight();
        }

        double[] arr = new double[list.size()];
        int index = 0;
        for (Student stu : list) {
            arr[index] = stu.getWeight() / weight;
            index++;
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        double number = Math.random();
        int result = -Arrays.binarySearch(arr, number) - 1;

        Student stu = list.get(result);
        System.out.println(stu);

        double w = stu.getWeight() / 2;
        stu.setWeight(w);

        BufferedWriter bw = new BufferedWriter(new FileWriter("Java\\src\\com\\amy\\javabasics\\testPa\\names.txt"));
        for (Student s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
    }
}
