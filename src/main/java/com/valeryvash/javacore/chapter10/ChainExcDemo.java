package main.java.com.valeryvash.javacore.chapter10;

public class ChainExcDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("Upper level");

        e.initCause(new ArithmeticException("Cause"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Exception catched " + e);
            System.out.println("Fist cause is " + e.getCause());
        }
    }
}
