package main.java.com.valeryvash.javacore.chapter10;

public class NestTry {
    public static void main(String[] args) {
        try {
//            int a = args.length;
            int a = 1;

            int b = 42 / a;

            System.out.println("a= " + a);

            try {
                if (a == 1) a = a / (a - a);

                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero " + e);
        }
    }
}
