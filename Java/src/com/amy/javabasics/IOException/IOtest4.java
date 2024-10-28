package com.amy.javabasics.IOException;

import javax.swing.*;
import java.io.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class IOtest4 {
    public static void main(String[] args) throws IOException {
        //把文件读取到内存中
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hamba\\Desktop\\count.txt"));
        String line = br.readLine();
        br.close();
        
        int count = Integer.parseInt(line);
        //表示当前软件又运行了一次
        count++;
        //判断
        if (count <= 3) {
            JOptionPane.showMessageDialog(null, "欢迎使用本软件，第" + count + "免费使用");
        } else {
            JOptionPane.showMessageDialog(null, "只能免费3次，休想白嫖！");
        }
        //写出count
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hamba\\Desktop\\count.txt"));
        bw.write(count + "");
        bw.close();
    }
}
