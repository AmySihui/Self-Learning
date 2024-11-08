package com.amy.javabasics.Internet_.UDP;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入信息：");
            String str = sc.nextLine();
            if ("886".equals(str)) {
                break;
            }
            byte[] bytes = str.getBytes();

            InetAddress address = InetAddress.getByName("SIHUI");

            int port = 10086;

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            ds.send(dp);
        }

        ds.close();
    }
}
