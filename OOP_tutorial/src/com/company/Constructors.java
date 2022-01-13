package com.company;
class myEmployee1{
    private int id;
    private String name;
    //public myEmployee1(){
      //  id = 23;
        //name =  "Your name ";
    //}

    public myEmployee1(String myname, int myId){
        id = myId;
        name = myname;
    }

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
public class Constructors {
    public static void main(String[] args) {
        myEmployee1 manish = new myEmployee1("Codewith manish ",12);
        //manish.setId(34);
        //manish.setName("Manish");
        System.out.println(manish.getId());
        System.out.println(manish.getName());
    }
}
