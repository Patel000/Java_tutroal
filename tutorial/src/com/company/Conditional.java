package com.company;

public class Conditional {
    public static void main(String[] args) {
        int age = 34+6;
        boolean coun = (age == 40);
        if (age >= 18 && coun) {
            System.out.println("Car is drive!");
        }
        else {
            System.out.println("Enter exit");
        }
    }
}
