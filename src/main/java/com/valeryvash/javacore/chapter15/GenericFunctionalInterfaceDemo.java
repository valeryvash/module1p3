package main.java.com.valeryvash.javacore.chapter15;

interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) ->
        {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda reversed " + reverse.func("Lambda"));
        System.out.println("Expression reversed " + reverse.func("Expression"));

        SomeFunc<Integer> fact = (integer ->{
            int result = 1;

            for (int i = 1; i <= integer; i++) {
                result *= i;
            }

            return result;
        });

        System.out.println("Factorial of 3 equals "+ fact.func(3));
        System.out.println("Factorial of 5 equals "+ fact.func(5));

    }
}
