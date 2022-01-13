package com.company;

class Employee1{
    int id;
    int salary = 200;
    String name;
    public void printDate(){
        System.out.println("ID:"+ id);
        System.out.println("Name:"+name);
    }

    public void getSalay(){
        System.out.println(salary);
    }
}

public class OOP {
    public static void main(String[] args) {
        //abstraction and encapsulation, Inheratance,polymarphism,
        System.out.println("This is our custam class");
        Employee manish = new Employee();
        manish.id = 12;
        manish.name = "ManishPare";
        System.out.println(manish.id+"\n" + manish.name);
        manish.printDate();
        Employee joon = new Employee();
        joon.id = 10;
        joon.name="Joon";
        joon.printDate();

    }
}
