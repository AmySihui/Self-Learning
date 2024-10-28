package com.amy.javabasics.convertstream;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01ConvertStream {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\hamba\\Desktop\\gbkfile.txt"), "GBK");
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char)ch);
//        }
//        isr.close();

        FileReader fr = new FileReader("C:\\Users\\hamba\\Desktop\\gbkfile.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();


    }
}
