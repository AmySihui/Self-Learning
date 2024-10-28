package com.amy.javabasics.convertstream;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo03ConvertStream {
    public static void main(String[] args) throws IOException {
        //JDK11以前
      /*  InputStreamReader isr = new InputStreamReader(new FileInputStream("Java\\b.txt"), "GBK");
        OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("Java\\d.txt"), "UTF-8");

        int b;
        while ((b = isr.read()) != -1) {
            osr.write(b);
        }
        osr.close();
        isr.close();
        */

        //JDK11以后
        FileReader fr = new FileReader("Java\\b.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("Java\\d.txt",Charset.forName("UTF-8"));

        int b;
        while ((b = fr.read()) != -1) {
            fw.write(b);
        }
        fw.close();
        fr.close();

    }
}
