package com.amy.javabasics.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("amy", 23, "beijing");
        Student s2 = new Student("june", 25, "tianjin");
        Student s3 = new Student("susan", 28, "nanjing");


        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Java\\a.txt"));
        oos.writeObject(list);

        oos.close();
    }
}
