// FileInputStream class demonstration
package main.java.com.valeryvash.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) {
        int size;

        String path = "src/main/java/com/valeryvash/javacore/chapter20/FileInputStreamDemo.java";
        try (FileInputStream f = new FileInputStream(path)) {
            System.out.println("Common amount of allowed bytes: " + (size = f.available()));
            int n = size / 40;
            System.out.println("First " + n + " bytes, readed by read() method call");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println("Allowed " + f.available());
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.err.println("Cannot be read the next " + n + " bytes");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("Allowed " + f.available());


            System.out.println("Skip the next half of allowed bytes by half() method call");
            f.skip(size / 2);
            System.out.println("Allowed " + f.available());

            System.out.println("Read of " + n/2 + " bytes in the end of massive");

            if(f.read(b,n/2,n/2) != n/2){
                System.err.println("Cannot be read the next " + n + " bytes");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("Allowed " + f.available());
        } catch (IOException e) {
            System.out.println("Input output exception");
        }

    }
}
