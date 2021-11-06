package main.java.com.valeryvash.javacore.chapter13;

import java.io.*;

public class T implements Serializable {
    transient int a; // will not be saved while object will be saved
    int b;

    public T(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "a: " + this.a +" b: "+ this.b;
    }

    public static void main(String[] args) {

        String filePath = "src/main/java/com/valeryvash/javacore/chapter13/source/1.example";

        T tout = new T(5, 5);
        System.out.println("Object before save: "+ tout);

        try (FileInputStream fin = new FileInputStream(filePath);
             FileOutputStream fout = new FileOutputStream(filePath);
             ObjectOutputStream oout = new ObjectOutputStream(fout);
             ObjectInputStream oin = new ObjectInputStream(fin)
        ) {

            oout.writeObject(tout);
            fout.flush();
            T tin = (T) oin.readObject();
            System.out.println("Object after read from file "+tin.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
