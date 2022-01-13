package com.company;
class myEmployee2{
    private int id;
    private String name;
    public myEmployee2(){
        id = 23;
        name =  "Your name ";
    }

    public myEmployee2(String myname, int myId){
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
public class Constructors_class {
    public static void main(String[] args) {
        myEmployee2 manish = new myEmployee2("Codewith manish ",12);
        myEmployee2 manish1 = new myEmployee2();
        System.out.println(manish1.getName());
        //manish.setId(34);
        //manish.setName("Manish");
        System.out.println(manish.getId());
        System.out.println(manish.getName());
    }
}
