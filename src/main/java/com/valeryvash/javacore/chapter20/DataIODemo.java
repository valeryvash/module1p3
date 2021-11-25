package main.java.com.valeryvash.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dout =
                     new DataOutputStream(new FileOutputStream("test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
            dout.writeUTF("Example string");
        } catch (IOException e) {
            System.out.println("IO error");
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("test.dat"))) {

            System.out.println(din.readDouble());
            System.out.println(din.readInt());
            System.out.println(din.readBoolean());
            System.out.println(din.readUTF());

        }   catch (IOException e) {
            System.out.println("IO error");
        }

    }
}
