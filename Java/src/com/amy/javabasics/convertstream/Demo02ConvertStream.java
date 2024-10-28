package com.amy.javabasics.convertstream;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo02ConvertStream {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Java\\b.txt"), "GBK");
        osw.write("你好你好");
        osw.close();

        FileWriter fw = new FileWriter("Java\\b.txt", Charset.forName("GBK"));
        fw.write("不好！");
        fw.close();
    }
}
