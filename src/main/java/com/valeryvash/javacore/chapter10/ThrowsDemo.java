package main.java.com.valeryvash.javacore.chapter10;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("In throwOne method body");
        throw new IllegalAccessException("Demonstration");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Exception catches");
        }
    }
}
