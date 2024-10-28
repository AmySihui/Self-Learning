package com.amy.javabasics.convertstream;

import java.io.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo04ConvertStream {
    public static void main(String[] args) throws IOException {
        //利用字节流读取文件，每次读取一整行，不能出现乱码
        BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream("Java\\d.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.print(line);
        }
        br.close();
    }
}
