package com.company;

import java.nio.charset.StandardCharsets;

public class String_mathod {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println("name");
        System.out.println(name.length());
        System.out.println(name.getBytes());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace('h', 'M'));
        String nonTrimmedString = "     Harry    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());


        System.out.println(name.substring(0));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry", "ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("y"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("H"));
        System.out.println(name.indexOf("ry"));
        System.out.println(name.indexOf("y"));

        System.out.println(name.strip());

        System.out.println(name.indexOf("rry" , 4));

        System.out.println(name.lastIndexOf('r'));
        System.out.println(name.lastIndexOf('r',3));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("hArry"));

        System.out.println(name.getBytes(StandardCharsets.UTF_8));
        System.out.println("I am escap sequencd \" double quote \\  \n \t \bthank you");






    }
}

