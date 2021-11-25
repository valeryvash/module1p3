package main.java.com.valeryvash.javacore.chapter22;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");

        URLConnection hpCon = hp.openConnection();
        long d = hpCon.getDate();

        if (d == 0) {
            System.out.println("No date data");
        } else {
            System.out.println(new Date(d));
        }

        System.out.println("Type of content: " + hpCon.getContent());

        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println("No date data");
        } else {
            System.out.println("Expiration date: " + new Date(d));
        }

        d = hpCon.getLastModified();
        if (d == 0) {
            System.out.println("No date data");
        } else {
            System.out.println("Last modified" + new Date(d));
        }

        long len = hpCon.getContentLengthLong();
        if (len == -1) {
            System.out.println("Length is unavailable");
        } else {
            System.out.println("Length of content " + len);
        }

        if (len != 0) {
            System.out.println("===Content===");
            InputStream in = hpCon.getInputStream();
            while(((c = in.read())) != -1)
            {
                System.out.print((char) c);
            }
            in.close();
        } else {
            System.out.println("Content is unavailable");
        }





    }
}
