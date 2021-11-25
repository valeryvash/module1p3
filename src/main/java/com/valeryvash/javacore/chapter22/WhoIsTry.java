package main.java.com.valeryvash.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIsTry {
    public static void main(String[] args) throws IOException {

        try (Socket s = new Socket("whois.internic.net", 43);){

            InputStream is = s.getInputStream();
            OutputStream out = s.getOutputStream();

            String str = "google.com\r";

            byte buf[] = str.getBytes();

            out.write(buf);

            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}
