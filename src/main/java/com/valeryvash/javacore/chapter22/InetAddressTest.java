package main.java.com.valeryvash.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        System.out.println(address.isMulticastAddress());

        address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(address);

        InetAddress sw[] = InetAddress.getAllByName("www.nba.com");
        Arrays.stream(sw).forEach(System.out::println);

    }
}
