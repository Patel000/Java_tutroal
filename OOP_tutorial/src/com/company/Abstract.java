package com.company;

abstract class Perant2{
    public  Perant2(){
        System.out.println("Mai base3 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void geet1();
}

class Child2 extends Perant2{
    @Override
    public void geet1(){
        System.out.println("Good maoring");
    }
}

abstract class Child3 extends Perant2{
    public void th(){
        System.out.println("I an good");
    }
}

public class Abstract {
    public static void main(String[] args) {
        //Perant2 p = new Perant2();  --error
        Child2 c  = new Child2();
        //Child3 c3 = new Child3();   -- error
    }
}

