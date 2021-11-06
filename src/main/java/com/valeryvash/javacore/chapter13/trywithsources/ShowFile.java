package main.java.com.valeryvash.javacore.chapter13.trywithsources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Usage: Showfile file_name");
            return;
        }

        try( FileInputStream fileInputStream = new FileInputStream(args[0])){
            do {
                i = fileInputStream.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
