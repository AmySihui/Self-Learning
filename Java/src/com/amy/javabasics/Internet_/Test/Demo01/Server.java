package com.amy.javabasics.Internet_.Test.Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        while ((b = isr.read())!= -1) {
            System.out.print((char)b);
        }

        socket.close();
        ss.close();
    }
}