package com.amy.javabasics.File_;

import java.io.File;
import java.io.IOException;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo02File {
    public static void main(String[] args) throws IOException {
        //file01();
        //file02();
        //file03();
        file04();

    }

    private static void file04() {
        File file1 = new File("E:\\Files\\个人材料");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] list2 = file1.listFiles();
        for (File file : list2) {
            System.out.println(file);
        }
    }

    private static void file03() {
        //File file1 = new File("C:\\Users\\hamba\\Desktop\\1.txt");
        //System.out.println("file1.delete() = " + file1.delete());

        File file2 = new File("C:\\Users\\hamba\\Desktop\\hah");
        System.out.println("file2.delete() = " + file2.delete());
    }

    private static void file02() throws IOException {
        File file1 = new File("C:\\Users\\hamba\\Desktop\\2.txt");
        System.out.println("file1.createNewFile() = " + file1.createNewFile());

        File file2 = new File("C:\\Users\\hamba\\Desktop\\hah\\hh\\ii");
        System.out.println("file2.mkdir() = " + file2.mkdirs());



    }

    private static void file01() {
        File file1 = new File("1.txt");
        System.out.println("file1.getAbsolutePath() = " + file1.getAbsolutePath());

        File file2 = new File("io\\2.txt");
        System.out.println("file2.getPath() = " + file2.getPath());

        File file3 = new File("E:\\Idea\\io\\3.jpg");
        System.out.println("file3.getName() = " + file3.getName());

        File file4 = new File("C:\\Users\\hamba\\Desktop\\1123.txt");
        System.out.println("file4.length() = " + file4.length());



    }
}
