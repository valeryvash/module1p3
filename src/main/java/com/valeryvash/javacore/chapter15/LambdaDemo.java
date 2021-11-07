package main.java.com.valeryvash.javacore.chapter15;

interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;

        myNum = () -> 123.45;

        System.out.println("Constant value: " + myNum.getValue());

        myNum = () -> Math.random() * 100;

        System.out.println("Random value: " + myNum.getValue());
        System.out.println("Another one random value: " + myNum.getValue());

//        myNum = () -> "123.00";

    }
}
