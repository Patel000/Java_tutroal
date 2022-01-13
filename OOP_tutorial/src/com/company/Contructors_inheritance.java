package com.company;

class Base1{
    Base1(){
        System.out.println("Mai ek constructor hoon!");
    }

    Base1(int x){
        System.out.println("I an an overladed constructor with value of x as:" + x);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}

class Derived1 extends Base1{
    Derived1() {
        super(0);
        System.out.println("He Derived! int ....");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructed with value"+ y);
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I an a chiled of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I an a chiled of derived constructoer z:"+ z);
    }
}

public class Contructors_inheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        Derived1 d = new Derived1();
        // erro Derived1 d1 = new Derived1(34);
        Derived1 d1 = new Derived1(3,54);
        ChildOfDerived child = new ChildOfDerived(2,5,9);


    }
}
