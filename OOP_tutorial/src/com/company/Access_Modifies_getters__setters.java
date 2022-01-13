package com.company;

class myEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int n){
        this.id = n;
    }
    public int getId(){
        return id;
    }
}

public class Access_Modifies_getters__setters {
    public static void main(String[] args) {
        myEmployee manish = new myEmployee();
       // manish.id = 33;
      //  manish.name = "manihs";

        manish.setName("Manihs");
        System.out.println(manish.getName());
    }

}
