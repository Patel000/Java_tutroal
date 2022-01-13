package com.company;

public class Mathod_loading {
    static void foo() {
        System.out.println("Good morning bro!");

    }
    static void foo(int a) {
        System.out.println("Good morning " + a + " bro!");
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }

    public static void main(String[] args) {
        int [] mark = {12,34,43,23,45,45};

        // change int
        int x = 45;
        change(x);
        System.out.println("That valuse of a after running change " + x);

        //change array
        change2(mark);
        System.out.println("That change is after runniung change " + mark[0]);

        // Mathod overloading
        foo();
        foo(400);

        //Arguments are actual!


    }

}
