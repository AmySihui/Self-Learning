package com.amy.javabasics.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01ObjectStream {
    public static void main(String[] args) throws IOException {
        Student stu = new Student("amy", 23,"beijing");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Java//a.txt"));
        oos.writeObject(stu);
        oos.close();
    }
}
