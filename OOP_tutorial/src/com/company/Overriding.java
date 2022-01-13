package com.company;

class A{
    public int a;

    public int harry(){
        return 43;
    }

    public void meth2(){
        System.out.println("I an method 2 of class A");
    }

}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I an method 2 of class B");
    }

    public void meth3(){
        System.out.println("I an method 3 of class B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();

    }
}
