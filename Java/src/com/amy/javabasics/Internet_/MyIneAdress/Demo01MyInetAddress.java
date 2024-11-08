package com.amy.javabasics.Internet_.MyIneAdress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01MyInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("SIHUI");
        System.out.println("address = " + address);

        String hostName = address.getHostName();
        System.out.println("hostName = " + hostName);

        String hostAddress = address.getHostAddress();
        System.out.println("hostAddress = " + hostAddress);

        byte[] address1 = address.getAddress();
        System.out.println("address1 = " + address1);

    }
}
