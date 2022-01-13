package com.company;

public class proj_05 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        int sum = 0;
        int n = 4;
        for (int i = 0; i < n; i++) {
            sum = sum + (2*n);
        }
        System.out.println(sum);



    }
}
