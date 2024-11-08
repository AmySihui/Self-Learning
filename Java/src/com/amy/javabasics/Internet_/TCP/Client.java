package com.amy.javabasics.Internet_.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);

        OutputStream os = socket.getOutputStream();
        os.write("你好你好".getBytes());

        os.close();
        socket.close();
    }
}
