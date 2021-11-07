package main.java.com.valeryvash.javacore.chapter15;

interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) ->{
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Factorial of 3 equals: " + factorial.func(3));
        System.out.println("Factorial of 5 equals: " + factorial.func(5));
    }
}
