package com.amy.javabasics.printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("Java\\a.txt"), true, Charset.forName("UTF-8"));
        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf("%s learn %s", "amy","java");
        ps.close();
    }
}
