package main.java.com.valeryvash.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        Optional<Integer> prodObject = myList.stream().reduce((a, b)-> a * b);
        if(prodObject.isPresent()) System.out.println("Multiplying result :" + prodObject.get());

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Multiplying as int value : " + product);


    }
}
