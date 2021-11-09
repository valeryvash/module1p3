package main.java.com.valeryvash.javacore.chapter29;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        double productOfSqrRoots = myList.parallelStream().reduce(
                1.0, // base for every element
                (a, b) -> a * Math.sqrt(b), // each element in stream. 'a' is previous, b is the next
                (a, b) -> a * b // parallel streams combine principle
        );
        System.out.println("Multiplying of square roots: " + productOfSqrRoots);
    }
}
