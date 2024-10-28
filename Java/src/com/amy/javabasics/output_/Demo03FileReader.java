package com.amy.javabasics.output_;

import java.io.FileOutputStream;
import java.io.FileReader;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo03FileReader {
    public static void main(String[] args) throws Exception {
        //Method01();
        Method02();
    }

    private static void Method02() throws Exception {
        FileOutputStream fos = new FileOutputStream("Java\\test.txt");
        fos.write("我不好".getBytes());
        FileReader fR = new FileReader("Java\\test.txt");
        char[] chars = new char[2];
        int len;
        while ((len = fR.read(chars)) != -1) {
            System.out.print(new String(chars,0,len));
        }

    }

    private static void Method01() throws Exception {
        FileOutputStream fos = new FileOutputStream("Java\\test.txt");
        fos.write("我不好".getBytes());
        FileReader fR = new FileReader("Java\\test.txt");
        int len;
        while ((len = fR.read()) != -1) {
            System.out.print((char) len);
        }

        fR.close();

    }
}
