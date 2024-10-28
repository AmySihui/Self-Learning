package com.amy.javabasics.output_;

import java.io.FileWriter;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo04FileWriter {
    public static void main(String[] args) throws Exception {
        Method01();
    }

    private static void Method01() throws Exception{
        FileWriter fw = new FileWriter("Java\\test.txt",true);
        fw.write("123455");
        fw.flush();
        fw.close();
    }
}
