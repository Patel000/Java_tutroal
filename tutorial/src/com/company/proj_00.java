package com.company;

import java.util.Scanner;

public class proj_00 {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);
        System.out.println("Enter Math English SST EVS");
        int student_Math = student.nextInt();
        int student_English = student.nextInt();
        int student_SST = student.nextInt();
        int student_EVS = student.nextInt();
        System.out.println("Percent of all Math English SST EVS is :");
        int per = (5*(student_English+student_EVS+student_Math+student_SST)/100);
        System.out.println(per);

    }
}
