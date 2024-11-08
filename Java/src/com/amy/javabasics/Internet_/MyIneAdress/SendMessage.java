package com.amy.javabasics.Internet_.MyIneAdress;

import java.io.IOException;
import java.net.*;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class SendMessage {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String str = "你好！";
        byte[] bytes = str.getBytes();

        InetAddress address = InetAddress.getByName("SIHUI");

        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        ds.send(dp);

        ds.close();
        
    }
}
