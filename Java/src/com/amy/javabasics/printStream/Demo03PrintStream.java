package com.amy.javabasics.printStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Amy Wang
 * @version 1.0"Java\\a.txt",ture, Charset.forName("GBK")
 */
public class Demo03PrintStream {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("Java\\a.txt"), true);
        pw.println("cccc");
        pw.println("nihaohaohaohoah");
        pw.print("aaaaa");
        pw.close();
    }
}
