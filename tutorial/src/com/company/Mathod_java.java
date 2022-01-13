package com.company;
//VarArgs
public class Mathod_java {
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b , int c){
        return a+b+c;
    }

    /*static int sum_infi(int ...arr){
        //Availbae as int [] arr;
        int result = 0;
        for (int a : arr) {
            result +=a;
        }
        return result;
    }
    */

    static int sum_infi(int x , int ...arr){
        //Availbae as int [] arr;
        int result = x;
        for (int a : arr) {
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcom to Varagre TYutorial");
        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("The sum of 5, 54 ande 4 is: " + sum(5, 54, 4));
        System.out.println("The sum ifiirt arrg 3,34....is: "+ sum_infi(4, 453,54,23));
        System.out.println("The sum 0 arr::"+ sum_infi(1));
    }
}
