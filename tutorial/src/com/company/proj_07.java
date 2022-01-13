package com.company;

public class proj_07 {
    // proj
    static void multiplication(int n){
        for (int i = 1; i < 10; i++) {
            System.out.format("%d X %d = %d\n", n,i,i*n);
        }
    }
    //proj_1
    static int sumRect(int n){
        // base condition
        if (n==1){
            return 1;
        }
        else {
            return n + sumRect(n-1);
        }
    }

    //proj_2
    //fibonacci 0,1,1,2,....
    static int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }


    public static void main(String[] args) {
        multiplication(7);
        int sum = sumRect(5);
        System.out.println(sum);
        System.out.println(fib(4));
    }
}
