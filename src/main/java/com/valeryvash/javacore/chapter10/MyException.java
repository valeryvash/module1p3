package main.java.com.valeryvash.javacore.chapter10;

public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        this.detail = a;
    }

    @Override
    public String toString() {
        return "My excception[" + this.detail + "]";
    }

}

class ExceptionDemo{

    static void compute(int a) throws MyException{
        System.out.println("compute(int " + a + ") method called");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Normal method end");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Exception catched: " + e);
        }
    }
}

