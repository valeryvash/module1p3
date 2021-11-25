package main.java.com.valeryvash.javacore.chapter20;

import java.io.*;

class MyClass9 implements Serializable{
    String name;
    int anInt;
    double aDouble;

    public MyClass9(String name, int anInt, double aDouble) {
        this.name = name;
        this.anInt = anInt;
        this.aDouble = aDouble;
    }

    @Override
    public String toString() {
        return this.name + " " + this.anInt+ " " + this.aDouble;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {

        try (
                FileOutputStream fos = new FileOutputStream("serial");
                ObjectOutputStream oos = new ObjectOutputStream(fos) ) {

            MyClass9 object1 = new MyClass9("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            oos.writeObject(object1);

        } catch (IOException e) {
            System.out.println("Exception during serialisation: " + e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass9 object2 = (MyClass9) ois.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during deserialization: " + e);
            System.exit(0);
        }

    }
}
