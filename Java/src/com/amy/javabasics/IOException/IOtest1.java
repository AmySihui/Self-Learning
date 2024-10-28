package com.amy.javabasics.IOException;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class IOtest1 {
    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        //Method01();
        //Method02();
        //Method03();
        Method04();
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0 + "秒");
    }

    //字节缓冲流，一次读取一个字符
    private static void Method04() throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\hamba\\Desktop\\CA\\Week5 Lab_Solution.pdf");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hamba\\Desktop\\123.pdf");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            fos.write(len);
        }
        fos.close();
        fis.close();
    }

    //字节缓冲流，一次读取一个字节
    private static void Method03() throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\hamba\\Desktop\\CA\\Week5 Lab_Solution.pdf");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hamba\\Desktop\\123.pdf");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        bos.close();
        bis.close();
    }

    //字节基本流，一次读取一个字节数组
    private static void Method02() throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\hamba\\Desktop\\CA\\Week5 Lab_Solution.pdf");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hamba\\Desktop\\123.pdf");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }

    //字节基本流，一次读取一个字符数组
    private static void Method01() throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\hamba\\Desktop\\CA\\Week5 Lab_Solution.pdf");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hamba\\Desktop\\123.pdf");
        int line;
        while ((line = fis.read()) != -1) {
            fos.write(line);
        }
        fos.close();
        fis.close();
    }

}
