package com.company;

public class Each_loop {
    public static void main(String[] args) {
        int[] mark = { 53,45,32,45,55,34,23};
        // using for loop
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }

        // using reverse order
        for (int i = mark.length-1; i >=0; i--) {
            System.out.println(mark[i]);
        }

        // SET1
        for (int element :
                mark) {
            System.out.println(element);
        }
    }
}
