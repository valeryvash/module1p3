package main.java.com.valeryvash.javacore.chapter15;

interface NumericTest2 {
    boolean test(int n, int d);
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (int n, int d) -> (n % d) == 0;

        if (isFactor.test(10,2)) System.out.println("Number 2 is factor for 10");

        if (!isFactor.test(10,3)) System.out.println("Number 3 is not factor for 10");
    }
}
