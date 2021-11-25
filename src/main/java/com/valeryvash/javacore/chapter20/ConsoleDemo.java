package main.java.com.valeryvash.javacore.chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console console;

        console = System.console();

        if (console==null) {
            System.out.println("System.console() return null");
            return;
        }
        // I regret to inform that this code doesn't work in IntelliJIdea
        str = console.readLine("Input string: ");
        console.printf("Inputted string is: %s\n", str);
    }
}
