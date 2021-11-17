package main.java.com.valeryvash.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Data for massive input";

        byte buf[] = s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Exception during buffer write by write() method call");
            return;
        }

        System.out.println("Buffer as symbol string ");
        System.out.println(f.toString());
        System.out.println("as a massive");
        byte b[] = f.toByteArray();
        for (int i = 0; i < b.length; i++) System.out.print((char) b[i]);

        System.out.println("\n In output stream 'OutputStream()");
        try (
                FileOutputStream f2 = new FileOutputStream("text2.txt")
        ) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Exception during buffer write by write() method call");
            return;
        }
        System.out.println("reset() method call");
        f.reset();

        for (int i = 0; i<3; i++ ) f.write('X');
        System.out.println(f.toString());
    }
}
