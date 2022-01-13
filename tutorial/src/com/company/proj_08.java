package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }



}

public class proj_08 {
    public static void main(String[] args) {
        Employee manish = new Employee();
        manish.setName("CodewithManihs");
        System.out.println(manish.getName());

    }
}
