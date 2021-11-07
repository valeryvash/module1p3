package main.java.com.valeryvash.javacore.chapter15;

interface StringFunc {
    String func(String n);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reserve = (str) ->{
            String result = "";
            int i;

            for (i = str.length() - 1 ; i >= 0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda is reversed on " + reserve.func("Lambda"));
        System.out.println("Expression is reversed on " + reserve.func("Expression"));
    }
}
