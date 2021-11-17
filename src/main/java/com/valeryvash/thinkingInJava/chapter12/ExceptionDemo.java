package main.java.com.valeryvash.thinkingInJava.chapter12;

public class ExceptionDemo {
    public static void main(String[] args) {
        Exception e = new Exception("The exception threw message");

        try {
            throw e;
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        } finally {
            System.out.println("Finally called");
        }

        Object ob = null;

        try {
            System.out.println(ob.hashCode());
        } catch (NullPointerException exception) {
            exception.printStackTrace(System.out);
        }

        int a[] = new int[0];

        try {
            a[1] = 0;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace(System.out);
        }

        try {
            throw new TaskExceptionDemo("lulz)");
        } catch (TaskExceptionDemo ee) {
            System.out.println(ee.getMessage());
            ;
        }

        while (true) {
            try {
                f();
            } catch (Exception eee) {
                eee.printStackTrace(System.out);
                continue;
            }
            break;
        }
    }

    static int f = 3;

    static void f() throws Exception {
        if(--f > 0) {
            throw new Exception("f is smaller than zero");
        }
        System.out.println("'f()' method successfully finished");
    }

}

class TaskExceptionDemo extends Exception {

    private String message;

    public TaskExceptionDemo(){ message = "default constructor";}
    public TaskExceptionDemo(String msg) {message = msg;}

    @Override
    public String getMessage() {
        return message;
    }
}