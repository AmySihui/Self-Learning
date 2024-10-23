package com.amy.javabasics.File_;

import java.io.File;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01File {
    public static void main(String[] args) {
        file01();
        file02();


    }

    static void file02() {
        String path1 = "E:\\Idea\\io";
        System.out.println("path1 = " + path1);

        String path2 = "E:" + File.separator + "Idea" + File.separator + "io";
        System.out.println("path2 = " + path2);

        File file1 = new File("E:\\Idea\\io", "1.jpg");
        System.out.println("file1 = " + file1);
        File parent = new File("E\\Idea\\io");
        File file2 = new File(parent, "1.jpg");
        System.out.println("file2 = " + file2);


    }

    static void file01() {
        String pathSeparator = File.pathSeparator;
        System.out.println("pathSeparator = " + pathSeparator);

        String separator = File.separator;
        System.out.println("separator = " + separator);
    }
}
