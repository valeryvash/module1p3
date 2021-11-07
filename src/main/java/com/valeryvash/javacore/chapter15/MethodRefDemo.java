package main.java.com.valeryvash.javacore.chapter15;

interface StringFunc2 {
    String func(String n);
}

class MyStringOps {

    static String strReverse(String str) {

        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class MethodRefDemo {

    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda improves Java efficiency";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Initial string: " + inStr);
        System.out.println("Reversed string: " + outStr);

    }
}
