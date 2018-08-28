package org.eddie.test.generic;

import java.util.ArrayList;

public class Test {
    private int a;

    {
        System.out.println(a);
    }

    public void sayHello(String a) {
        System.out.println("super");
        System.out.println("hello" + a);
    }
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test test = test1;
        test.sayHello("hello");
        Test1[] testarray = new Test1[2];
        Test[] array = testarray;
        array[0] = new Test();
    }
}

class Test1 extends Test {
    public void hi () {
        System.out.println("sub");
    }
    public void sayHello(String b) {
        System.out.println("sub");
        System.out.println("hello " + b);
        super.sayHello("lalalal");
    }
}