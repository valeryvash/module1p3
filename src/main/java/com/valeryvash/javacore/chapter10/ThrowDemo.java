package main.java.com.valeryvash.javacore.chapter10;

public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("Demonstration");
        } catch (NullPointerException e) {
            System.out.println("Exception catched in demoproc() " + e);
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Second catch: " + e);
        }
    }
}
