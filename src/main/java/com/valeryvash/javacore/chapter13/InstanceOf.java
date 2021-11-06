package main.java.com.valeryvash.javacore.chapter13;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int i;
}

class D extends A {
    int j;
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) System.out.println("a is instance of A");
        if (b instanceof B) System.out.println("b is instance of B");
        if (c instanceof C) System.out.println("c is instance of C");
        if (c instanceof A) System.out.println("c can be casted to A");
        if (a instanceof C) System.out.println("a can be casted to C");

        System.out.println();

        A ob;

        ob = d;
        System.out.println("ob is a link to the d");

        if (ob instanceof D) System.out.println("ob can be casted to the D");

        System.out.println();

        ob = c;
        System.out.println("ob is a link to the c");
        if (ob instanceof D) System.out.println("ob can be casted to the D");
        else System.out.println("ob cannot be casted to the D");

        if (ob instanceof A) System.out.println("ob can be casted to the A");

        System.out.println();

        if (a instanceof Object) System.out.println("a can bee casted to the Object");
        if (b instanceof Object) System.out.println("b can bee casted to the Object");
        if (c instanceof Object) System.out.println("c can bee casted to the Object");
        if (d instanceof Object) System.out.println("d can bee casted to the Object");


    }
}
