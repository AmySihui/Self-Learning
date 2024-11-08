package com.amy.javabasics.Internet_.Test.Demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        System.out.println("等待连接");
        Socket socket = ss.accept();
        System.out.println("已连接");

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        System.out.println("准备读取数据");
        while ((b = isr.read()) != -1) {
            System.out.println("正在读取");
            System.out.println((char)b);
        }

        System.out.println("数据读取完毕，准备回写");
        String str = "不好！";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());
        System.out.println("回写成功");

        socket.close();
        ss.close();


    }
}
