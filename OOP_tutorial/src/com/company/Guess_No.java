package com.company;
import java.util.Random;
import java.util.Scanner;

class Guess{
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int guess = rn.nextInt(100);
        boolean runing = true;

        public void setGuess(){
            while (runing){
                int userNum = sc.nextInt();
                if (userNum > guess){
                    System.out.println("Guess a number is less then..");
                }
                else if (userNum < guess){
                    System.out.println("Guess a number is high then..");
                }
                else if (userNum == guess){
                    System.out.println("Confital .. you");
                    runing = false;
                }

            }
        }


}
public class Guess_No {
    public static void main(String[] args) {
        Guess guess = new Guess();
        guess.setGuess();




    }
}
