package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Moring..");
    }
    default void record4Kvidoes(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface WiFi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phone){
        System.out.println("Calling"+ phone);
    }
    void pickCall(){
        System.out.println("Calling...");
    }
}

class MySmartPhone extends MyCellPhone implements WiFi, Camera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap..");
    }
//    public void record4Kvidoes(){
  //      System.out.println("Taking Recording in 4k...");
    //}

    public String[] getNetwork(){
        System.out.println("Getting List of Networkds");
        String[] networkList = {"manihs","ajanti34","priti"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connenting to " + network);
    }
}
public class Default_methods {
    public static void main(String[] args) {
        MySmartPhone mi = new MySmartPhone();
        mi.record4Kvidoes();
        String[] ar = mi.getNetwork();
        for (String item:
             ar) {
            System.out.println(item);

        }
    }
}
