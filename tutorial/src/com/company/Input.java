package com.company;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.println("Taking input user");
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number"  );
        int a = user.nextInt();
        System.out.println("Enter b number");
        int b = user.nextInt();
        System.out.println("Sum is :");
        int sum = a + b;
        System.out.println(sum);
        boolean check = user.hasNextInt();
        System.out.println(check);
    }
}
