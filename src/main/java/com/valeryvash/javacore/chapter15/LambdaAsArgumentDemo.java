package main.java.com.valeryvash.javacore.chapter15;

import java.util.Locale;

interface StringFunc1 {
    String func(String string);
}

public class LambdaAsArgumentDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda expressions increase Java efficiency";
        String outStr;

        System.out.println("This is the initial string: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);

        System.out.println("This string in upperCase: " + outStr);

        outStr = stringOp((str) ->
        {
            String result = "";
            int i;
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;

        }, inStr);

        System.out.println("This stroke w/o spaces: " + outStr);

        StringFunc stringFunc = (str) -> {
            String result = "";
            int i = str.length() - 1;

            for (; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("This is reversed string: " + stringOp(stringFunc, inStr));
    }
}
