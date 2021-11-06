package main.java.com.valeryvash.javacore.chapter10;

public class FinallyDemo {
    static void procA() {
        try{
            System.out.println("method procA body");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("finally in procA method");
        }
    }

    static void procB(){
        try{
            System.out.println("method procB body");
            return;
        } finally {
            System.out.println("finally in procB method");
        }
    }

    static void procC(){
        try{
            System.out.println("method procC body");
        } finally {
            System.out.println("finally in procC method");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }

        procB();
        procC();
    }

}
