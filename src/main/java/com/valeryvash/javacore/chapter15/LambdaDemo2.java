package main.java.com.valeryvash.javacore.chapter15;

interface NumericTest {
    boolean test(int i);
}

public class LambdaDemo2 {
    public static void main(String[] args) {

//        NumericTest isEven = (n) -> (n % 2) == 0; // Cannot be applied to negative numbers
        NumericTest isEven = (n) -> (n & 1) == 0; // Better way check oddity

        if (isEven.test(10)) System.out.println("Number 10 is even");
        if (!isEven.test(9)) System.out.println("Number 9 is odd");

        NumericTest isNonNeg = (n) -> n >= 0;

        if(isNonNeg.test(1)) System.out.println("Number 1 is not negative");
        if(!isNonNeg.test(-1)) System.out.println("Number 1 is negative");
    }

}
