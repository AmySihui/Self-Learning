package com.amy.javabasics.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo02ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Java\\a.txt"));
        Student o = (Student) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
