package main.java.com.valeryvash.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream;

        if (args.length != 1) {
            System.out.println("Usage: Showfile file_name");
            return;
        }

        try {
            fileInputStream = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be opened");
            return;
        }

        try{
            do {
                i = fileInputStream.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Error during file close");
        }

    }
}
