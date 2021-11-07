package main.java.com.valeryvash.javacore.chapter15;

@FunctionalInterface
interface MyFunc5<T> {
    MyClass3<T> func(T n);
}

class MyClass3<T> {
    private T val;

    MyClass3(T v) {this.val = v;}

    MyClass3() { this.val = null;}

    T getVal() {return val;}
}

public class ConstructorRefDemo2 {

    public static void main(String[] args) {
        MyFunc5<Integer> myFunc5 = MyClass3<Integer>::new;

        MyClass3<Integer> mc3 = myFunc5.func(100);

        System.out.println("'val' value in object mc3 equals: " + mc3.getVal());

    }


}
