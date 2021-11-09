package main.java.com.valeryvash.javacore.chapter29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail1 {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail1(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NamePhone1 {
    String name;
    String phonenum;

    public NamePhone1(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
}

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail1("Larry", "555-5555", "Larry@herbShildt.com"));
        myList.add(new NamePhoneEmail1("James", "555-4444", "James@herbShildt.com"));
        myList.add(new NamePhoneEmail1("Mary", "555-3333", "Mary@herbShildt.com"));

        Stream<NamePhone1> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone1(a.name,a.phonenum));

        List<NamePhone1> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Names and phone numbers from 'npList' reestablished list ");
        npList.forEach(a -> System.out.println(a.name + " " + a.phonenum));

        nameAndPhone = myList.stream().map(
                a -> new NamePhone1(a.name, a.phonenum)
        );

        Set<NamePhone1> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nNames and phone numbers in 'npSet' set:");
        npSet.forEach(a -> System.out.println(a.name + " " + a.phonenum));

        nameAndPhone = myList.stream().map(
                a -> new NamePhone1(a.name, a.phonenum)
        );

        LinkedList<NamePhone1> npLinkedList = nameAndPhone.collect(
                LinkedList::new,
                (list, element) -> list.add(element),
                (listA, listB) -> listA.addAll(listB)
        );

        System.out.println("\nNames and phones in 'npLinkedList' : ");
        npLinkedList.forEach(element -> System.out.println(element.name + " " + element.phonenum));

    }
}
