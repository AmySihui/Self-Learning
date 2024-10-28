package com.amy.javabasics.IOException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class IOtest3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hamba\\Desktop\\csb.txt"));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),line);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hamba\\Desktop\\new.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();

    }
}
