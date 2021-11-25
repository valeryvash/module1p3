package main.java.com.valeryvash.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This data shall be in the array";
        char buf[] = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Error during writing in buffer");
            return;
        }

        System.out.println("Buffer as string");
        System.out.println(f.toString());
        System.out.println("In array");

        char c[] = f.toCharArray();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("\nIn stream of FileWriter()");
        try (FileWriter f2 = new FileWriter("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("IO error " + e);
        }

        System.out.println("Setup for initial state");
        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.print(f.toString());
    }
}
