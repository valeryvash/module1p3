package main.java.com.valeryvash.javacore.chapter15;

@FunctionalInterface
interface MyFunc6<R, T> {
    R func(T n);
}

class MyClass4<T> {
    private T val;

    public MyClass4(T val) {this.val = val;}
    public MyClass4(T val,T val2) {this.val = val;}

    public MyClass4() {this.val = null;}

    T getVal(){return this.val;}
}

class MyClass5 {
    private String str;

    public MyClass5(String str) {this.str = str;}

    public MyClass5() {this.str = "";}

    String getVal(){return this.str;}
}

public class ConstructorRefDemo3 {

    static <R, T> R myClassFactory(MyFunc6<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc6<MyClass4<Double>, Double> myClassCons = MyClass4<Double>::new;

        MyClass4<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("'val' value in object 'mc' equals: " + mc.getVal());

        MyFunc6<MyClass5, String> myClassCons2 = MyClass5::new;

        MyClass5 mc5 = myClassFactory(myClassCons2, "Lambda");

        System.out.println("'str' value in object 'mc5' equals " + mc5.getVal());


    }
}
