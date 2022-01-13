package com.company;

public class Mathod {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y)*9;
        }
        return z;
    }

    public static void main(String[] args) {
        System.out.println(logic(3,4));
    }


}
