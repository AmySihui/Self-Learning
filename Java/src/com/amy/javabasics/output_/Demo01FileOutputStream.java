package com.amy.javabasics.output_;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01FileOutputStream {
    public static void main(String[] args) throws IOException {
        //Method01();
        //Method02();
        //Method03();
        Method04();
    }

    private static void Method04() throws IOException {
        FileOutputStream fos = new FileOutputStream("Java\\1.txt",true);
        fos.write("chuang".getBytes());
        fos.close();

    }

    private static void Method03() throws IOException {
        FileOutputStream fos = new FileOutputStream("Java\\1.txt");
        fos.write("abc".getBytes());
        fos.close();
    }

    private static void Method02() throws IOException {
        FileOutputStream fos = new FileOutputStream("Java\\1.txt");
        byte[] bytes = {97, 98, 99, 100, 101, 102};
        fos.write(bytes);
        fos.write(bytes,3,8);

    }

    private static void Method01() throws IOException {
        FileOutputStream fos = new FileOutputStream("Java\\1.txt");
        fos.write(97);
        fos.close();

    }
}
