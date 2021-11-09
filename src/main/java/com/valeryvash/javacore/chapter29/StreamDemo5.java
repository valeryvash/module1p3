package main.java.com.valeryvash.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail{
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phonenum;

    public NamePhone(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
}

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@herbShildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@herbShildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@herbShildt.com"));

        System.out.println("Initial elements in 'myList' list" );
        myList.stream().forEach(a -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map(
                a -> new NamePhone(a.name, a.phonenum)
        );


        List<NamePhone> list = nameAndPhone.collect(Collectors.toList());
        list.forEach(a -> System.out.println(a.phonenum + " " + a.name));


//        System.out.println("List of 'names' and 'numbers': ");
//        nameAndPhone.forEach(a -> System.out.println(a.name + " " + a.phonenum));
    }
}
