package main.java.com.valeryvash.javacore.chapter20;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = "This is copyright sign &copy; " +
                ", but &copy is not";

        char buf[] = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        CharArrayReader in = new CharArrayReader(buf);
        int c;
        boolean marked = false;

        try (BufferedReader f = new BufferedReader(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&' -> {
                        if (marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Input/output error");
        }
    }
}
