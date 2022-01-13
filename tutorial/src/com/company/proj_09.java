package com.company;

class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("vibrating>>>");
    }
    public void callfriend(){
        System.out.println("Call frined");
    }
}
public class proj_09 {
    public static void main(String[] args) {
        CellPhone vivo = new CellPhone();
        vivo.ringing();
        vivo.callfriend();
    }

}
