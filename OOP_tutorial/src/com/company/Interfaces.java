package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int a = 45;
    void blowHarnK3g();
    void blowHornmhr();
}
class AyonCycle implements Bicycle, HornBicycle {
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Breke");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHarnK3g(){
        System.out.println("Kabhi khusi kasbhi gum");
    }

    public void blowHornmhr(){
        System.out.println("Main hoon nee po po po ");
    }

}

public class Interfaces {
    public static void main(String[] args) {
        AyonCycle cycle = new AyonCycle();
        cycle.applyBrake(1);
        // you can creat properties in Interfaces
        System.out.println(cycle);
        //You can not modify the interfase
        //cycle.a = 45;
        cycle.blowHarnK3g();
        cycle.blowHorn();
    }

}
