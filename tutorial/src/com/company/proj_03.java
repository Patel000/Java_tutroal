package com.company;

import java.util.Locale;

public class proj_03 {
    public static void main(String[] args) {
        // Proj
        String name = "Manih";
        name = name.toLowerCase();
        System.out.println(name);
        //Proj 2
        String text = "Hell dsfsf     fsdff";
        text = text.replace(" ", "_");
        System.out.println(text);
        //Proj 3
        String letter = " Dear <|name|>, Thank a lot!";
        letter = letter.replace("<|name|>", "Manish");
        System.out.println(letter);

        // Proj 4
        String myString = "this  string conteains   double and triple spacse";
        System.out.println(myString.indexOf( "  "));
        System.out.println(myString.indexOf("     "));

        //Proj 5
        String letter_1 = "Dear manish ,\nThis java course is Nice . \n \tThanks";
        System.out.println(letter_1);
    }
}
