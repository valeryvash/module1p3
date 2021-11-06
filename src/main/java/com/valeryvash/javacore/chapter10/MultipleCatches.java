package main.java.com.valeryvash.javacore.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
//        args = new String[1];
//        args[0] = "q";
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is in out of bounds: " + e);
        }
        System.out.println("After try/catch block");
    }
}
