package main.java.com.valeryvash.javacore.chapter15;

interface StringFunc3 {
    String func(String string);
}

class MyStringOps1 {
    String strReverse(String str) {
        String result = "";
        int i = str.length() - 1;
        for (; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class MethodRefDemo2 {

    static String stringOp(StringFunc3 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda improves Java efficiency";
        String outStr;

        MyStringOps1 strOps = new MyStringOps1();

        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Initial string: " + inStr);
        System.out.println("Reversed string: " + outStr);
    }
}
