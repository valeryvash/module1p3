package main.java.com.valeryvash.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alfa");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Xi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Spliterator<String> splitItr = myStream.spliterator();

        while(splitItr.tryAdvance(n -> System.out.println(n)));
    }
}
