package com.amy.javabasics.Internet_.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ds.receive(dp);
            byte[] data = dp.getData();
            int length = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();

            System.out.println("ip为：" + ip + "主机为：" + name + "的人，发送了数据：" + new String(data, 0, length));
        }


    }
}
