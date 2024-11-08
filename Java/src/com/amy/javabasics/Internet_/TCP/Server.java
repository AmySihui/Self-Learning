package com.amy.javabasics.Internet_.TCP;

import java.io.BufferedReader;
import java.io.IOException;
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

        /*InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bfr = new BufferedReader(isr);*/

        BufferedReader bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int b;
        while ((b = bfr.read()) != -1) {
            System.out.println((char) b);
        }

        socket.close();
        ss.close();
    }
}
