package main.java.com.valeryvash.javacore.chapter15;

interface MyFunc3<T> {
    int func(T[] vals, T t);
}

class MyArraysOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) count++;
        }

        return count;
    }
}

public class GenericMethodRefDemo {

    static <T> int myOp(MyFunc3<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"One", "Two", "Three", "Two"};

        int count;

        count = myOp(MyArraysOps::<Integer>countMatching, vals, 4);
        System.out.println("vals array contains " + count + " numbers 4");

        count = myOp(MyArraysOps::<String>countMatching, strs, "Two");
        System.out.println("strs array contains " + count + " entity of 'Two'");
    }
}
