package com.amy.javabasics.output_;

import java.io.FileInputStream;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo02FileInputStream {
    public static void main(String[] args) throws Exception {
        //Method01();
        Method02();

    }

    private static void Method02() throws Exception {
        FileInputStream fis = new FileInputStream("Java\\1.txt");
        byte[] bytes = new byte[2];
        /*int len1 = fis.read(bytes);
        System.out.println(len1);
        System.out.println(new String(bytes,0,len1));

        int len2 = fis.read(bytes);
        System.out.println(len2);
        System.out.println(new String(bytes,0,len2));*/

       /* int len3 = fis.read(bytes);
        System.out.println(len3);
        System.out.println(new String(bytes,0,len3));
*/

        int len;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
    }

    private static void Method01() throws Exception {
        FileInputStream fis = new FileInputStream("Java\\1.txt");
        /*int datal = fis.read();
        System.out.println(datal);

        int data2 = fis.read();
        System.out.println(data2);

        int data3 = fis.read();
        System.out.println(data3);

        int data4 = fis.read();
        System.out.println(data4);*/

        System.out.println("=======================");

        int len;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }


        fis.close();
    }
}
