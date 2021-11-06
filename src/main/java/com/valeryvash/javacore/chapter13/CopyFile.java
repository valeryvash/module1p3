package main.java.com.valeryvash.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;

        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error input-output");
        } finally {
            //Example doesn't work
//            try {
//                if (fin != null) fin.close();
//            } catch (IOException e) {
//                System.out.println("Error during file close");
//            }
//            try {
//                if (fout != null) fout.close();
//            } catch (IOException e) {
//                System.out.println("Error during file close");
//            }

        }

    }
}
