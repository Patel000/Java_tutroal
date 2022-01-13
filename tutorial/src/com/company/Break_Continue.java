package com.company;

public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            System.out.println("Hello");
            System.out.println("Break");
            if ( i == 3){
                System.out.println("i == 3");
                break;
            }
        }
    }
}
