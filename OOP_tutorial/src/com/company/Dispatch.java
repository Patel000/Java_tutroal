package com.company;

class Phone{
    public void on(){
        System.out.println("My name is java:");
    }
    public void toTime(){
        System.out.println("Time is 8 am");
    }
}

class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("My name is Java is Class two");
    }

    public void music(){
        System.out.println("Aapka Play is musin hai");
    }

}
public class Dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();   //Allow
        //SmartPhone swobj = new SmartPhone();  //Allow
        //obj.name();

        Phone obj = new SmartPhone();  // Yes it is Allowed
        // SmartPhone obj2 = new Phone();  // Not allowed
        obj.toTime();
        obj.on();


    }
}
