package com.company;

class Base{
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I an a constructor");
    }
}

class Derive extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}

public class Inherritance {
    public static void main(String[] args) {
        // base
        Base base=new Base();
        base.setX(4);
        System.out.println(base.getX());


        // derive
        Derive b = new Derive();
        b.setY(45);
        b.setX(43);
        System.out.println(b.getX());
        System.out.println(b.getY());
    }
}
