package com.amy.javabasics.IOException;

import java.io.FileWriter;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01Exception {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("Java\\test2.txt")){
            fw.write("你好啊");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
