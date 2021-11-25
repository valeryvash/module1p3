package main.java.com.valeryvash.javacore.chapter20;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        File file;
        try (FileReader fr = new FileReader("src/main/java/com/valeryvash/javacore/chapter20/FileReaderDemo.java")) {
            int c;
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("Input/Output error");
        }
    }
}
