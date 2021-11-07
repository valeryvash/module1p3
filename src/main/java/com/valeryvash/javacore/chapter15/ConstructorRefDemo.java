package main.java.com.valeryvash.javacore.chapter15;

interface MyFunc4 {
    MyClass2 func(int i);
}

class MyClass2 {
    private int val;

    MyClass2(int v) { this.val = v; }

    MyClass2() { this.val = 0; }

    int getVal() { return this.val; }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myFunc4 = MyClass2::new;

        MyClass2 mc2 = myFunc4.func(100);

        System.out.println("val value in mc2 object equals " + mc2.getVal());
    }

}
