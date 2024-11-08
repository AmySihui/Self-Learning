package com.amy.javabasics.Internet_.Test.Demo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();

        while (true) {
            System.out.println("请输入信息");
            String str = sc.nextLine();
            if ("886".equals(str)) {
                break;
            }
            os.write(str.getBytes());
        }

        socket.close();
    }
}
