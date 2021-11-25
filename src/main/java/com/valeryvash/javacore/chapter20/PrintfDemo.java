package main.java.com.valeryvash.javacore.chapter20;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Some formatted data presented below");

        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);
        System.out.println();

        System.out.printf("%f\n", 1234567.123);
        System.out.printf("%,f\n", 1234567.123);
        System.out.printf("%f\n", -1234567.123);
        System.out.printf("%,(f\n", 1234567.123);
        System.out.printf("%,(f\n", -1234567.123);

        System.out.printf("% ,.2f\n %,.2f\n", 123456789.123,-123456789.123);
    }
}
