package com.company;

public class Relation_Operator {
    public static void main(String[] args) {
        int age = 18;
        boolean coun = age == 19;
        if (age >=18 && coun){
            System.out.println("Hello you age is 18 and car drive");
        }
        else if (age >= 18 || coun){
            System.out.println("Hello! you age is or operator");
        }
        System.out.println(!coun);
    }
}
