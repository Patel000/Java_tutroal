package com.company;

public class Try_case {
    public static void main(String[] args) {
        try {
            int a = 34;
            a = a/0;
            System.out.println("tye case");
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.printf("%s", e);
        }
    }
}
