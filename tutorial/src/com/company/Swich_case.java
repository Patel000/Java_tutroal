package com.company;

import java.util.Scanner;

public class Swich_case {
    public static void main(String[] args) {
        int age ;
        System.out.println("Enter a age you:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("You age car drive!");
            case 23 -> System.out.println("You also car dirve!");
            case 68 -> System.out.println("You are very old car drive!");
            default -> System.out.println("Thank you!");
        }
    }
}
